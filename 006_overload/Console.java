public class Console {
  public static void main(String[] args) {
    Console myConsole = new Console();
    System.out.println("Test1");
    myConsole.test1();
    System.out.println("Test2");
    myConsole.test2();
    System.out.println("Test3");
    myConsole.test3();
  }

  public void test1() {
    Calculator myCal = new Calculator();
    myCal.next("+", 1);
    myCal.next("+", 2);
    myCal.next(3);
    myCal.next(4);
    myCal.next("+", 5);
    System.out.println("Summary is " + myCal.getSummary());
    System.out.println("Dumping history");
    for (String i:myCal.dumpHistory()){
      System.out.print(" " + i);
    }
    System.out.println("");
  }

  public void test2() {
    String[] history = {"0", "+", "1", "+", "2", "+", "3", "+", "4", "+", "5"};
    Calculator myCal = new Calculator(history);
    System.out.println("Summary is " + myCal.getSummary());
    System.out.println("Dumping history");
    for (String i:myCal.dumpHistory()){
      System.out.print(" " + i);
    }
    System.out.println("");
  }

  public void test3() {
    Calculator myCal = new Calculator();
    myCal.next("+", 1);
    myCal.next(2);
    myCal.next(3);
    myCal.next("-", 4);
    myCal.next("*", 5);
    myCal.next(6);
    myCal.next("-", 7);
    myCal.next(8);
    System.out.println("Summary is " + myCal.getSummary());
    System.out.println("Dumping history");
    for (String i:myCal.dumpHistory()){
      System.out.print(" " + i);
    }
    System.out.println("");
  }
}
