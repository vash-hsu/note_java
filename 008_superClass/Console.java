public class Console {
  public static void main(String[] args) {
    System.out.println("=== MyClassA ===");
    MyClassA myA = new MyClassA();
    System.out.println("=== MyClassB ===");
    MyClassB myB = new MyClassB();
    System.out.println("=== MyClassC ===");
    MyClassC myC = new MyClassC();
    System.out.println("=== MyClassC(Hello World) ===");
    MyClassC myC2 = new MyClassC("Hello World");
  }
}

class Helper {
  public static void printWhere(String msg) {
    System.out.print("inside Constructor " + msg +", ");
  }
  public static void printWho(String msg) {
    System.out.println("I am " + msg);
  }
}

class MyClassA {
  public MyClassA() {
    Helper.printWhere("MyClassA");
    Helper.printWho(this.getClass().getName());
  }
}

class MyClassB extends MyClassA {
  public MyClassB() {
    Helper.printWhere("MyClassB");
    Helper.printWho(this.getClass().getName());
  }
  public MyClassB(String msg) {
    System.out.println("I am " + this.getClass().getName()
    + ", at Constructor MyClassB(String) "
    + "and I have something to say: " + msg);
  }
}

class MyClassC extends MyClassB {
  public MyClassC() {
    Helper.printWhere("MyClassC");
    Helper.printWho(this.getClass().getName());
  }

  public MyClassC(String extra) {
    //System.out.println("nothing can be performed before super()");
    //Console.java:50: error: call to super must be first statement in constructor
    //super(extra);
    //     ^
    //1 error
    super(extra);
    System.out.println("I am " + this.getClass().getName()
    + ", at Constructor MyClassC(String) "
    + "and I told my parent: " + extra);
  }
}
