public class Finalize{
  protected String status;

  public Finalize(){
    status = "Now, it's done by constructor!";
    printStatus();
  }
  protected void finalize(){
    status = "Now, it's done by finalize function";
    printStatus();
  }

  private void printStatus(){
    System.out.println(status);
  }
}
