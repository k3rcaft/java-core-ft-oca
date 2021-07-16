package com.thanhquangvo.core_java_apis.string_series;

public class Concatenation {

    public static void main(String[] args) {
        concatenation();
    }

    /**
     * Some rules:
     * 1. If both operands are numeric, + means numeric addition.
     * 2. If either operand is a String, + means concatenation.
     * 3. The expression is evaluated left to right
     */
    static void concatenation() {
        System.out.println("---------concatenation");
        System.out.println(1 + 2);
        System.out.println(1 + "a");
        System.out.println(1 + 2 + "a");
    }


}
