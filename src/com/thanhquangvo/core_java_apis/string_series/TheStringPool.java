package com.thanhquangvo.core_java_apis.string_series;

// the string pool contains literal values that appear in your program.
// value of string is reuse able for multiple references (not create new instance String once)
// a optimize way for memory of Java
public class TheStringPool {

    public static void main(String[] args) {
        stringPool();
        notStringPool();
    }
    static void stringPool() {
        String a = "hello";
        String b = "hello";
        System.out.println(a == b);
    }

    static void notStringPool() {
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b);
    }
}
