public class Console {
  public static void main(String args[]) {
    Stack myStack = new Stack(10);
    boolean returnValue;
    for (int i=0; i<10; i++) {
      System.out.print("pushing " + i);
      returnValue = myStack.push(i);
      System.out.println(" returning " + returnValue);
    }
    returnValue = myStack.push(99);
    System.out.println("pushing more and return " + returnValue);
    for (int i=0; i<10; i++) {
      System.out.println("poping " + myStack.pop());
    }
      System.out.println("poping more and return " + myStack.pop());
  }
}
