package com.thanhquangvo.operators_and_statements.binary_arithmetic_operators;

// include + - ++ -- !
public class UnaryOperators {

    static boolean x = false;
    static  int a = 10;

    public static void main(String[] args) {
        // logical operation
        x = !x;

        // negation operation
        a = -a;

        // increment operation
        System.out.println(++a);

        // decrement operation
        System.out.println(a--);
    }
}
