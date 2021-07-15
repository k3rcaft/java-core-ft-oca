package com.thanhquangvo.operators_and_statements.statements;

public class WhileStatement {

    public static void main(String[] args) {
        simpleWhile();
        multipleStatementWhile();
    }

    static void simpleWhile() {
        while (true)  //condition
            //statement handle
            System.out.println("hello world"); //single statement do not need {}
    }

    static void multipleStatementWhile() {
        while (true)  {
            System.out.println("hello world");
            System.out.println("hello world 2");
        }
    }
}
