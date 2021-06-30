### Understanding Package Declarations and Imports

When use class from package, we need import address of the class (package).

```java
import java.util.Random; // import tells us where to find Random

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // print a number between 0 and 9
    }
}
```

import doesn't import child packages, fields, or methods; it imports only classes.

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

(1) :point_right: java lang package is automatically considered to be imported. </br>
(2) (3) :point_right: import same packages.

In addition, we don't need imports a class that is in the same package as the
class importing it.
