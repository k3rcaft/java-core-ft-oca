package com.thanhquangvo.java_building_blocks;

public class MainMethod_3 {
    // context: run in default package not package declare
    // javac MainMethod.class
    // java MainMethod Bronx Zoo
    // java MainMethod "Bronx Zoo" San
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
