## Concatenation

### Some rules while String concatenation: 
- If both operands are numeric, + means numeric addition.
- If either operand is a String, + means concatenation.
- The expression is evaluated left to right.

```java
    System.out.println(1 + 2); // 3
    System.out.println("a" + "b"); // ab
    System.out.println("a" + "b" + 3); // ab3
    System.out.println(1 + 2 + "c"); // 3c
```

[comment]: <> (![image info]&#40;../../resources/images/string-concat.svg&#41;)
![Alt text](../../resources/images/string-concat.svg)
