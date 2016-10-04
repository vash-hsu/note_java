
public class Employee {

    // public: visible for any child class.
    public String name;

    // private: in class only.
    private int ggs;

    // constructor, need not return type, must be public
    public Employee (String string_name) {
        name = string_name;
    }

    // should setter/getter always be public?
    public void setGGS(int int_ggs) {
        ggs = int_ggs;
    }

    // access instance variable
    public void show() {
        System.out.println("name : " + name );
        System.out.println("ggs : " + ggs);
    }

    public String[] retrieve() {
        String[] personal = new String[2];
        personal[0] = name;
        personal[1] = String.valueOf(ggs);
        return personal;
    }

}