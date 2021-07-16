package com.thanhquangvo.core_java_apis.string_series;

//An example for immutable class
public class ImmutableClass {
    private String s = "name";

    public String getS() {
        return s;
    }

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass();
        immutableClass.getS(); // like String type

        immutableString();
    }

    static void immutableString() {
        String s1 = "hello";
        s1.concat("world"); // immutable s1 is not have change itself
        System.out.println(s1);
        //capture it by another var
        String s2 = s1.concat("world");
        System.out.println(s2);
    }
}
