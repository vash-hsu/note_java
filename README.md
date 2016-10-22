# Note during Java Learning

## Note  
[NOTEBOOK.md](NOTEBOOK.md)

---
# sample code

### 001.HelloWorld
```
public class Console {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

### 002.Constructor
```
public Puppy(){
    System.out.println("Puppy constructor without name");
}
public Puppy(String name){
    System.out.println("Puppy's name is " + name);
    _name = name;
}
```

### 003_datatypes
```
protected int getMax(int i){
    return 2147483647;
}
protected int getMin(int i){
    return getMax(i) + 1;
}

protected float getMax(float f){
    //f = Float.intBitsToFloat((int) 0xff7fffff);
    f = Float.MAX_VALUE;
    return f;
}
protected float getMin(float f){
    f = -Float.MAX_VALUE;
    return f;
}
```

### 004_variable
```
public class Employee {

    // public: visible for any child class.
    public String name;

    // private: in class only.
    private int ggs;

==== ====

public class Contractor extends Employee {
    // protected?
    // The protected modifier specifies that the member can only be accessed within its own package
    // (as with package-private) and,
    // in addition, by a subclass of its class in another package.
    protected int hourly;
```

### 005_stack
```
public class Stack {
  public Stack(int size) {
  public int pop() {
  public boolean push(int user_input) {
```

### 006_overload
```
public class Calculator {
  // constructor overloading
  public Calculator() {
  public Calculator(String[] userHistory) {
  // function overloading
  public boolean next(String op, int another) {
  public boolean next(int another) {
```

### 007_finalize
```
public class Finalize {
  public Finalize() {
  protected void finalize() {

=== ===

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

=== ===

1, create instance of Finalize
Now, it's done by constructor!
2, let that instance point to null
        sleeping second #1/5
        sleeping second #2/5
        sleeping second #3/5
        sleeping second #4/5
        sleeping second #5/5
3, force garbage collection
        sleeping second #1/5
Now, it's done by finalize function
        sleeping second #2/5
        sleeping second #3/5
        sleeping second #4/5
        sleeping second #5/5
4, be going to leave main()

```
