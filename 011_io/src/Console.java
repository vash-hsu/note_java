import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");
            String lineIn = myScanner.nextLine();
            if (lineIn.toLowerCase().equals("exit") ) {
                break;
            }
            else {
                Shell myShell = new Shell(lineIn);
                myShell.run();
            }
        }
        System.out.println("Bye ~");
    }
}
