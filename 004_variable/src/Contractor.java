
public class Contractor extends Employee {

    // protected?
    // The protected modifier specifies that the member can only be accessed within its own package
    // (as with package-private) and,
    // in addition, by a subclass of its class in another package.
    protected int hourly;

    public Contractor(String name){
        super(name);
    }

    public void setPayPerHour(int int_dollars){
        hourly = int_dollars;
    }

    public void show(){
        super.show();
        System.out.println("hourly : " + hourly);
    }

    public String[] retrieve(){
        String[] temp = super.retrieve();
        String[] result = new String[temp.length + 1];
        int i = 0;
        for (i=0; i<temp.length; i++)
        {
            result[i] = temp[i];
        }
        result[i] = String.valueOf(hourly);
        return result;
    }
}
