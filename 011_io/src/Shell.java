
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Shell {
    protected final int LingWidth = 32;
    protected String operator;
    protected String[] parameters;

    Shell(String line) {
        String[] terms = line.split(" ");
        if (terms.length >= 2)
        {
            operator = terms[0];
            parameters = new String[terms.length - 1];
            System.arraycopy(terms, 1, parameters, 0, parameters.length);
        } else {
            operator = terms[0];
            parameters = null;
        }
    }

    void run() {
        if (operator.equals("ls")) {
            if (parameters == null) {
                Ls myLs = new Ls(".");
                myLs.run();
            } else {
                for (String i: parameters) {
                    Ls myLs = new Ls(i);
                    myLs.run();
                }
            }
        } else if (operator.equals("hexdump")) {
            if (parameters == null || parameters.length == 0) {
                System.out.println("Usage: hexdump <Input Filename>");
            } else {
                for (String i: parameters) {
                    System.out.println("path: " + i);
                    Hexdump myHex = new Hexdump(i);
                    myHex.run();
                }
            }
        } else {
            try {
                Runtime.getRuntime().exec(operator);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                for (StackTraceElement clue:e.getStackTrace()) {
                    System.out.println(clue.toString());
                }
            }
        }
    }

    private class Hexdump {
        FileInputStream fileStream;

        Hexdump(String targetPath) {
            try {
                File fileHandler = new File(targetPath);
                if (fileHandler.exists() && fileHandler.isFile()) {
                    fileStream = new FileInputStream(fileHandler);
                } else {
                    System.out.println("ERROR: invalid path/filename");
                }
            } catch (FileNotFoundException e) {
                System.out.println("ERROR: File not Found");
                e.printStackTrace();
            }
        }

        private void run() {
            byte[] buffer = new byte[LingWidth];
            if (fileStream == null) {
                return;
            }
            try {
                while ( true ) {
                    int byteCount = fileStream.read(buffer);
                    if (byteCount == -1) { break; }
                    String temp = new String(buffer);
                    // System.out.print(temp);
                    System.out.print(convert2Printable(temp.substring(0, byteCount)));
                    System.out.print(String.format("%" + String.valueOf(LingWidth+2 - byteCount) + "s", " "));
                    System.out.println(convert2Hex(buffer, byteCount));
                }
                fileStream.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

        private String convert2Printable(String instring) {
            //ArrayList<Character> array = new ArrayList<Character>();
            StringBuilder result = new StringBuilder(instring.length());
            for (char ch:instring.toCharArray()) {
                //if (Character.isLetterOrDigit(ch) || Character.isSpaceChar(ch)) {
                if (ch >=32 && ch <127) {
                    result.append(ch);
                } else {
                    char replace = (char) 46;
                    result.append(replace);
                }
            }
            return result.toString();
        }
        // http://stackoverflow.com/questions/9655181/how-to-convert-a-byte-array-to-a-hex-string-in-java
        private String convert2Hex(byte[] bytes, int length) {
            final char[] hexArray = "0123456789ABCDEF".toCharArray();
            char[] charArray = new char[length * 3];
            for (int i=0; i<length; i++) {
                int ascii = bytes[i] & 0xFF;
                charArray[i*3] = hexArray[ascii >>> 4];  // high
                charArray[i*3 + 1] = hexArray[ascii & 0x0F]; // low
                charArray[i*3 + 2] = 0x20;
            }
            // System.out.println(charArray);
            return new String(charArray);
        }
    }

    private class Ls {
        String path = "";
        File fileHandler;
        Ls(String targetPath) {
            path = targetPath;
            fileHandler = new File(targetPath);
        }

        private void run () {
            if (fileHandler.exists()) {
                if (fileHandler.isFile()) {
                    for (String i: getInfo(fileHandler)) {
                        System.out.println(i);
                    }
                } else if (fileHandler.isDirectory()) {
                    for (String i: getInfo(fileHandler)) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("file not found");
            }
        }

        private ArrayList<String> getInfo(File fileHandle) {
            ArrayList <String> result = new ArrayList<>();
            result.add("absPath:\t" + fileHandle.getAbsolutePath());
            result.add("hashCode:\t" + fileHandle.hashCode());
            result.add("size: " + fileHandle.length());
            result.add("property:\t" + getInfoRWX(fileHandle));
            result.add("modified time:\t" +
                    convert2DateString(fileHandle.lastModified()));
            return result;
        }

        private String convert2DateString(float fDate) {
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String result = df.format(fDate);
            return result;
        }

        private String getInfoRWX(File file) {
            String result = "";
            if (file.canRead()) {
                result += "r";
            }
            else {
                result += "-";
            }
            if (file.canWrite()) {
                result += "w";
            }
            else {
                result += "-";
            }
            if (file.canExecute()) {
                result += "x";
            }
            else {
                result += "-";
            }
            return result;
        }

    }
}