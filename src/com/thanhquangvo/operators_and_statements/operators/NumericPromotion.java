package com.thanhquangvo.operators_and_statements.operators;

//Numeric Promotion Rules
//        1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
//        2. If one of the values is integral and the other is floating-point, Java will automatically
//        promote the integral value to the floating-point value’s data type.
//        3. Smaller data types, namely byte, short, and char, are first promoted to int any time
//        they’re used with a Java binary arithmetic operator, even if neither of the operands is
//        int.
//        4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.
public class NumericPromotion {
    public static void main(String[] args) {
        rule1();
        rule2();
        rule3();
        rule4();
    }

    static void rule1() {
        byte a = 8;
        long b = 10;
        long c = a + b;
        System.out.println(c);
    }

    static void rule2() {
        double a = 8.5;
        long b = 10;
        double c = a + b;
        System.out.println(c);
    }

    static void rule3() {
        short a = 8;
        short b = 10;
//        short c = a + b; compile error
        int d = a + b;
        System.out.println(d);
    }

    static void rule4() {
        short a = 1;
        long b = 2;
        float c = 3;
        double d = a + b + c;
        System.out.println(c);
    }
}
