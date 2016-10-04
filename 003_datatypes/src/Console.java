
public class Console {
    public static void main(String[] args) {
        Types myType = new Types();
        myType.setType("int");
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(1)) + " ~ " + String.valueOf(myType.getMin(1)));
        myType.setType("byte");
        byte myByte = 1;
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(myByte)) + " ~ " + String.valueOf(myType.getMin(myByte)));
        myType.setType("short");
        short myShort = 1;
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(myShort)) + " ~ " + String.valueOf(myType.getMin(myShort)));
        myType.setType("long");
        long myLong = 1;
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(myLong)) + " ~ " + String.valueOf(myType.getMin(myLong)));
        myType.setType("float");
        float myFloat = 1.0f;
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(myFloat)) + " ~ " + String.valueOf(myType.getMin(myFloat)));
        myType.setType("double");
        double myDouble = 1.0;
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(myDouble)) + " ~ " + String.valueOf(myType.getMin(myDouble)));
        myType.setType("boolean");
        boolean bool = true;
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(bool)) + " ~ " + String.valueOf(myType.getMin(bool)));
        myType.setType("char");
        char ch = 'a';
        System.out.println(myType.type() + " : "
                + String.valueOf(myType.getMax(ch)) + " ~ " + String.valueOf(myType.getMin(ch)));
    }
}
