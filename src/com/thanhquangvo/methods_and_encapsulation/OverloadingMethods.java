package com.thanhquangvo.methods_and_encapsulation;

public class OverloadingMethods {

    /*
     * Can not same return type
     * Can not same specifier(static)
     * Can not same access modifier
     * Can not throw exception
     * But it must be not same param (number, type)
     */

    /**
     * Param rules:
     *
     * Exact match by type -> public String glide(int i, int j) {}
     * Larger primitive type -> public String glide(int i, int j) {}
     * Autoboxed type -> public String glide(int i, int j) {}
     * Varargs -> public String glide(int i, int j) {}
     */

    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }

    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
}
