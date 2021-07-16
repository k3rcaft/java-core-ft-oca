package com.thanhquangvo.core_java_apis.string_series;

public class StringMethods {

    public static void main(String[] args) {
        stringMethods();
        chainingMethods();
    }

    static void stringMethods() {
        String s = "example";

        System.out.println(s.length());

        System.out.println(s.charAt(0));

        System.out.println(s.indexOf("e"));

        System.out.println(s.substring(3));
        // argument's value is same will return empty
        System.out.println(s.substring(3, 3));
        //throw exception
//        System.out.println(s.substring(3, 2));
        //throw exception
//        System.out.println(s.substring(3, 20));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.equals("example"));
        System.out.println(s.equalsIgnoreCase("EXample"));

        System.out.println(s.startsWith("e"));
        System.out.println(s.endsWith("e"));

        System.out.println(s.contains("pl"));

        System.out.println(s.replace("xam", "sam"));

        System.out.println(s.trim());
    }

    static void chainingMethods() {
        String hello = "hello";
        System.out.println(hello.trim().substring(1).toUpperCase());
    }
}
