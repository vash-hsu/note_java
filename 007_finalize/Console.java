public class Console {
  public static void main(String[] args) {
    System.out.println("1, create instance of Finalize");
    Finalize myObj = new Finalize();
    System.out.println("2, let that instance point to null");
    myObj = null;
    Console.nop(5);
    System.out.println("3, force garbage collection");
    // garbage collection will trigger finalize() of object
    System.gc();
    Console.nop(5);
    System.out.println("4, be going to leave main()");
  }

  public static void nop(int second2Sleep) {
    for (int i=0; i<second2Sleep; i++) {
      System.out.println("\tsleeping second #" + (i+1) + "/" + second2Sleep);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
