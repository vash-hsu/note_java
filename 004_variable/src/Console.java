import java.io.*;

public class Console {
    public static void main(String args[]) {
        System.out.println("=====");
        Employee employee = new Employee("Hancock");
        employee.setGGS(7);
        employee.show();
        for (String i: employee.retrieve()) {
            System.out.println(i);
        }
        System.out.println("=====");
        Contractor contractor = new Contractor("Ohmae Haruko");
        contractor.setGGS(-7);
        contractor.setPayPerHour(3000);
        contractor.show();
        for (String i: contractor.retrieve()) {
            System.out.println(i);
        }
        System.out.println("=====");
        System.out.println(employee.name);
        // ggs is private;
        // System.out.println(employee.ggs);  // Error:(23, 36) java: ggs has private access in Employee
        System.out.println(contractor.name);
        // hourly is protected, so it is visible ...
        System.out.println(contractor.hourly);
    }
}
