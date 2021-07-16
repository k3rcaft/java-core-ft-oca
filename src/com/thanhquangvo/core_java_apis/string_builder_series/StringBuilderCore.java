package com.thanhquangvo.core_java_apis.string_builder_series;

//the StringBuilder changes its own state and returns a reference to itself!
public class StringBuilderCore {

    public static void main(String[] args) {
        simpleStringBuilder();
        someWayToCreateStringBuilder();
    }

    static void simpleStringBuilder() {
        StringBuilder stringBuilder1 = new StringBuilder("hello");
        StringBuilder stringBuilder2 = stringBuilder1.append("world");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
    }

    // capacity maximum it can contain
    // size how many it's containing
    static void someWayToCreateStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder("init value");
        StringBuilder stringBuilder2 = new StringBuilder(10);
    }
}
