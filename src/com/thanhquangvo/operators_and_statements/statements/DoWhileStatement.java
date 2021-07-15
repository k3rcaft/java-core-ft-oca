package com.thanhquangvo.operators_and_statements.statements;

// do while will run at least once
public class DoWhileStatement {

    public static void main(String[] args) {
        simpleDoWhile();
        multipleStatementDoWhile();
    }

    static void simpleDoWhile() {
        int i = 5;
        do
            System.out.println(i++); //single statement do not need {}
        while (i < 10); //condition
    }

    static void multipleStatementDoWhile() {
        int i = 5;
        do {
            i++;
            System.out.println("hello world");
            System.out.println("hello world 2");
        }
        while (i < 10);
    }
}
