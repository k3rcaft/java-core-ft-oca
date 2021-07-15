package com.thanhquangvo.operators_and_statements.statements;

import java.util.Arrays;
import java.util.List;

public class ForStatement {

    public static void main(String[] args) {
        //        for(initialization(can multiple, rule as declare multiple var same line); booleanExpression(require); updateStatement(can multiple)) {
//            body => optional {} when have single line statement
//        }
        simpleFor();
        multipleFor();
        errorFor();

        //        for(datatype instance : collection) {
//            body => optional {} when have single line statement
//        }
        simpleForEach();
        multipleForEach();
    }

    static void simpleFor() {
        for (int i = 0; i < 10; i++)
            System.out.print(i);
    }

    static void multipleFor() {
        for (int a = 0, b = 0; a < 10 && b < 10; a++, b++) {
            System.out.print(a);
            System.out.println(b);
        }
    }

    static void simpleForEach() {
        List<Integer> aList = Arrays.asList(1, 2, 3, 4);
        for (int a : aList)
            System.out.print(a);
    }

    static void multipleForEach() {
        List<Integer> aList = Arrays.asList(1, 2, 3, 4);
        for (int a : aList) {
            System.out.print(a);
            System.out.println(a + 1);
        }
    }

    static void errorFor() {
//        int a = 0;
//        for (int a = 0 (redeclare var), long b = 0 (error like declare multiple var same line); a  < 10 && b < 10; a++, b++) {
//            System.out.print(a);
//            System.out.println(b);
//        }
//        System.out.println(b); (out of scope b var)
    }
}
