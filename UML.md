# UML
---

# Class Diagram

| HelloWorld |
|---|
| - helloWorld: String |
| '<<'constructur'>>' HelloWorld(msg : String)  </br> + showOut(): String |
* there is one class named HelloWorld  having
 * one private attribute named helloWrold in type String;
 * one public operation named showOut whose return type is String
 * a constructor with parameter in type String


### Multiplicity types

| Symbol | meaning |
|---|---|
| 0 | none |
| 1 | one |
| m | integer |
| 0..1 | zero or one |
| m, n | m or n |
| m..n | m <= x <= n |
| * | x >=0 |
| 0..* | zero or more |
| 1..* | one or more |
