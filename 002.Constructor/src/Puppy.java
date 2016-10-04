import java.io.*;

public class Puppy {

    // instance variable
    int _age;
    String _name = "";

    // constructor w/o parameter

    public Puppy(){
        System.out.println("Puppy constructor without name");
    }
    public Puppy(String name){
        System.out.println("Puppy's name is " + name);
        _name = name;
    }

    public void setName(String name){
        _name = name;
    }

    public void setAge(int age){
        _age = age;
    }

    public int getAge(){
        return _age;
    }

    public String getName(){
        return _name;
    }

    public static void main(String[] args) {
        Puppy myPuppy1 = new Puppy("Little");
        myPuppy1.setAge(1);
        System.out.println(myPuppy1.getName() + " whose age is " + myPuppy1.getAge());
        Puppy myPuppy2 = new Puppy();
        myPuppy2.setAge(2);
        myPuppy2.setName("Snowball");
        System.out.println(myPuppy2.getName() + " whose age is " + myPuppy2.getAge());
    }
}
