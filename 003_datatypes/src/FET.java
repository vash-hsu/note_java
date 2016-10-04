
public class FET {
    public static void main(String[] args) {
        Types myError;
        try{
            myError = new Types("undef");
        } catch (Exception e){
            System.out.println(e.toString());
            System.out.println("=====");
            for (StackTraceElement i:e.getStackTrace()){
                System.out.println(i.toString());
            }
        }
    }
}