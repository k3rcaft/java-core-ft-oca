### Understanding Package Declarations and Imports

When use class from package, we need import address of the class (package).

```java
import java.util.Random; // (1)

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // print a number between 0 and 9
    }
}
```
(1) <br> 
:point_right: import tells us where to find Random. <br>
:point_right: import doesn't import child packages, fields, or methods; it imports only classes.

### Wildcards

```java
import java.util.*; // (1)

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // print a number between 0 and 9
    }
}
```

(1) :point_right: * is a wildcard that matches all classes in the package and only 1 * wildcard in import syntax.

```java
import java.nio.*.*; // (1)

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // print a number between 0 and 9
    }
}
```
(1) :point_right: don't do this.

### Redundant Imports

```java
import java.lang.*; // (1)
import java.util.Random; // (2)
import java.util.*; // (3)

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // print a number between 0 and 9
    }
}
```

(1) :point_right: Java Lang package is automatically considered to be imported. <br>
(2) (3) :point_right: import same packages.

In addition, we don't need imports a class that is in the same package as the
class importing it.

### Naming Conflicts

```java
import java.util.*; // (1)
import java.sql.*; // (2)

public class ImportExample {
    
}
```
(1) (2) :point_right: When the class is found in multiple packages, Java gives you the compiler error.

Solution for this:
```java
import java.util.Date; // (1)
import java.sql.*; // (2)

public class ImportExample {
    
}
```

(1) :point_right: When compile Java will take Date from java.util package and ignore Date in wildcard (2).

If you wanna use 2 classes in your class.

```java
import java.util.Date; // (1)
import java.sql.Date; // (2)

public class ImportExample {
    
}
```
(1) (2) :point_right: error compile.

Solution for this:
```java
public class ImportExample {
    java.sql.Date sqlDate; // (1)
    java.util.Date utilDate; // (2)
}
```

(1) (2) :point_right: use fully qualified class name;
