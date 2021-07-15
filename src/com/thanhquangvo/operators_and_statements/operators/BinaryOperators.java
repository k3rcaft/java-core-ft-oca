package com.thanhquangvo.operators_and_statements.operators;

// include + - * / %
public class BinaryOperators {

    public static void main(String[] args) {
        // Assignment operator
        int y = 10;
        arithmeticOperators();
        compoundAssignmentOperators();
        relationalOperators();
        logicalOperators();
        equalityOperators();
        castingPrimitiveValue();
        assignByExpression();
    }

    static void arithmeticOperators() {
        // Arithmetic operator
        System.out.println(10 / 3);
        System.out.println(10 % 3);
    }

    static void compoundAssignmentOperators() {
        int a = 10;
        long b = 20;
        int c = 0;
        // auto case b to int type
        c += b;
        System.out.println(c);
    }

    static void castingPrimitiveValue() {
        // casting primitive value
        int a = (int) (2147483649L);
        short s = (short) 192122299999L;
        System.out.println(a);
        System.out.println(s);
    }

    static void assignByExpression() {
        int a = 10;
        long b = (a = 9);
        System.out.println(a);
        System.out.println(b);
    }

    static void relationalOperators() {
        System.out.println(2 > 3);
        System.out.println(2 <= 5);

        Integer i = 10;
        // true when i reference point to class, subClass of Number
        System.out.println(i instanceof Number);
    }

    static void logicalOperators() {
        System.out.println("logicalOperators");
        boolean a = true;
        boolean b = false;

        // always check two expression a & b
        System.out.println(a & b); // both var must true will true
        System.out.println(a | b); // just 1 var true expression will true
        System.out.println(a ^ b); // a different b always is true

        Integer i = 10;
        // true when i reference point to class, subClass of Number
        System.out.println(i instanceof Number);

        // The short-circuit operators => determine in left expression first if it's true result will return
        // don't need check two expression like above
        boolean z = (true || false);
    }

    /**
     * Numeric primitive type not same data. the value automatically promoted
     * Compare 2 boolean value
     * Comparing 2 object, String, null ( Two references are equal if and only if they point to the same
     * object, or both point to null. )
     */
    static void equalityOperators() {
        System.out.println("equalityOperators");
        // boolean x = true == 3;  not mix multiple type
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);

        System.out.println(3 == 3.0);

        Object o = new Object();
        Object o1 = o;
        System.out.println(o == o1);
    }
}
