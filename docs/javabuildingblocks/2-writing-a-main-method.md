### Writing a main() Method
```java
public class Animal {

  public static void main(String[] args) {
    System.out.println(args[0]);
  }
}
```

A Java program begins execution with its main() method by JVM (Java Virtual
Machine).
* public :point_right: access modifier can call this method.
* static :point_right: can call the method by class name scope directly -> Animal.main().
* void :point_right: the method don't return anything.
* String[] args :point_right: input of method is accepted by one String array. Therefore, we can write String[] args, String args[] or String...
  args.

We can pass values in the args when run the program.

```bash
$ javac Zoo.java
$ java Zoo "San Diego" Zoo
```

If we use the args and not pass value when run the program. The JVM will throw java.lang.ArrayIndexOutOfBoundsException.
```java
public class Animal {

  public static void main(String[] args) {
    System.out.println(args[0]);
  }
}
```
```bash
$ javac Animal.java
$ java Animal
```
:point_right: Will throw exception.

