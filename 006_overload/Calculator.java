import java.util.*;
import java.lang.*;

public class Calculator {
  protected ArrayList<String> history;
  private int summary;

  // constructor overloading
  public Calculator() {
    summary = 0;
    history = new ArrayList<String>();
  }
  public Calculator(String[] userHistory) {
    history = new ArrayList<String>();
    for (String i:userHistory){
      history.add(String.valueOf(i));
    }
    summary = actByHistory();
  }

  public int getSummary() {
    return summary;
  }

  // function overloading
  public boolean next(String op, int another) {
    int tempSum = 0;
    try{
      tempSum = actByDefinedOp(summary, op, another);
      history.add(op);
      history.add(String.valueOf(another));
      summary = tempSum;
    } catch (Exception e){
      System.out.println(e.toString());
      return false;
    }
    return true;
  }
  public boolean next(int another) {
    String lastOp;
    lastOp = findLastOp();
    return next(lastOp, another);
  }

  public String[] dumpHistory() {
    String[] a = new String[history.size()];
    return history.toArray(a);
  }
  private int actByHistory() {
    int tempSum = 0;
    String nextop = "+";
    for (String i:history){
      // 1 + 2 + 3 - 4
      switch(i){
        case "+":
        case "-":
        case "*":
        case "/":
          nextop = i;
          break;
        default:
          int working = Integer.parseInt(i);
          tempSum = actByDefinedOp(tempSum, nextop, working);
          break;
      }
    }
    return tempSum;
  }
  private int actByDefinedOp(int a, String op, int b) {
    switch (op){
      case "+":
        return a+b;
      case "-":
        return a-b;
      case "*":
        return a*b;
      case "/":
        return a/b;
      default:
        return 0;
    }
  }
  private String findLastOp() {
    String lastOp = "+"; // default
    for (int i=history.size() -1; i>=0; i--){
      String current = history.get(i);
      if ( current.equals("+") || current.equals("-") ||
         current.equals("*") || current.equals("/")) {
        lastOp = current;
        break;
      }
    }
    return lastOp;
  }

}
