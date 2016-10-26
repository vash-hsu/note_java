import java.util.Scanner;

public class HandleInput {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    while (true) {
      System.out.print("Please leave your string message: ");
      String lineIn = myScanner.nextLine();
      System.out.println("You type: " + lineIn);
      System.out.println();
      System.out.print("Please leave your number: ");
      double amountDouble = myScanner.nextDouble();
      System.out.println("Your number: " + amountDouble);
      System.out.println();
      break;
    }
  }
}
