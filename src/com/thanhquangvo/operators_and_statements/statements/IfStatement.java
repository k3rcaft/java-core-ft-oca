package com.thanhquangvo.operators_and_statements.statements;

public class IfStatement {

    public static void main(String[] args) {
        singleIf();
        multipleIf();
        multipleIfElse();
        ternaryOperator();
    }

    static void singleIf() {
        System.out.println("singleIf");
        if (true)
            //single statement dont need {}
            System.out.println("hello world");
    }

    static void multipleIf() {
        System.out.println("multipleIf");
        if (true) {
            System.out.println("hello world");
            System.out.println("hello world 2");
        }
    }

    static void multipleIfElse() {
        System.out.println("multipleIfElse");
        if (true) {
            System.out.println("hello world");
        } else {
            System.out.println("hello world 2");
        }
    }

    static void ternaryOperator() {
        System.out.println("ternaryOperator");
        int x = 5 < 6 ? 5 : 6;
        System.out.println(x);

        int y = 1;
        int z = 1;
        final int v = y >= 10 ? y++ : z++;
        System.out.println(y + " " + z + " " + v);
    }
}
