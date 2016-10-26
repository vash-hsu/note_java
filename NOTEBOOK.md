# Notebook for Java

---

# Java Major Programming Concepts

## Inheritance
* reusing the fields and methods of the existing class
* superclass vs. subclass

## Interfaces
* a contract between objects on how to communicate with each other.

## Polymorphism

## Encapsulation

---
## Abstraction

---
## Classes
* Constructor
 * [sample code of constructor overloading](006_overload)
 * [sample code of finalize](007_finalize)
* class contains
 * local variable
   * inside methods, constructors, blocks
 * instance variables
   * within a class but outside any method
   * ilitialized when class is instantiated
   * <font color="red">QQ: Access modifiers can be given for instance variables.</font>
   * default value
     * number is 0
     * Booleans is false
     * object references is null
 * class variables
   * within a class, outside any method, with the static keyword


## Objects
* steps to create an Objects
 * declaration
   * variable name with an object type
 * instantiation
   * new
 * initialization
   * new followed by a call to a constructor


## Instance

## Method


### access modifiers

| - | private | default | protected | public |
|---|---|---|---|---|
| in same class | V | V | V | V |
| in subclass of same package | | V | V | V |
| in class of same package | | V | V | V |
| in subclass of different package | | | V | V |
| in different class of different package | | | | V |

### non-access modifiers
#### final
#### abstract
#### strictfp

## Message Parsing

---

# Rules

## Source file declaration Rules

* only one public class per source file
* multiple non-public Classes
* package statement

## Java package

* categorizing the classes and interfaces


---

# Java Data Type

## Primary Data type
* int : 2147483647 ~ -2147483648
* byte : 127 ~ -128
* short : 32767 ~ -32728
* long : 9223372036854775807 ~ -9223372036854775808
* double : 1.7976931348623157E308 ~ 4.9E-324
* float : 3.4028235E38 ~ -3.4028235E38
* boolean : true ~ false
* char : \u0000 ~ \uffff

## Promotions allowed for Primary Types
| Type | Valid Promotions |
|---|---|
| double | none |
| float | double |
| long | float or double |
| int | long, float, double |
| char | int, long, float, double |
| short | int, long, float, double |
| byte | short, int, long, float, double |
| boolean | none |



---

# Operators

## Compound Assignment Operators
```
+= , -=, *=, /=, %=
```
## Incresement and Decrement Operators
a

| | Expression | Explanation |  
|---|---|---|  
| preincrement | ++a | a = a+1, then use the new value of a |  
| postincrement | a++ | use the current value of a, then a = a+1 |  
| predecrement | --b | b = b-1, then use the new value of b |
| postdecrement | b-- | use the current value of b, then b = b-1 |





---

# Java Keyword

| . | . | . | . |
|--|--|--|--|
| abstract  | assert  | boolean  | break|
|byte| case  | catch|   char|
|class |  const |  continue|   default|
|do |  double|   else |  enum|
|extends  | final  finally |  float|  |
|import |  instanceof| int |  interface|
|for |  goto|   if |  implements|
|long | native | new | package|
|private | protected | public | return|
|short  |static | strictfp | super|
|throws | transient | try | void|
|switch | synchronized | this | throw|
|volatile | while   | . | . |


---
# QQ

## Week Reference vs. Soft Reference
* java.lang.ref, WeakReference, SoftReference, ReferenceQueue
 * how to use
 * when to use it

## Enumeration


## Class Relationship

#### Inheritance Relationship
* annotation at compiler time: @Overfide
* final
 * final method, not allowed to overwritten
 * final class, not allowed to inherite


#### Interfaces

#### Packaging

#### Inner Classes

##

##

---

# Javac Parameters

-classpath [class path], to set user class path  
-d [directories], to store .class file  
-g, to show debug info, local variable  

# Java / Javaw
* java [options] class [args]
* javaw [options] class [args]  
  no show command prompt
