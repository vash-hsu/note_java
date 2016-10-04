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
