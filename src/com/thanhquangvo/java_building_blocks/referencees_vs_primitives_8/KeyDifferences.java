package com.thanhquangvo.java_building_blocks.referencees_vs_primitives_8;


public class KeyDifferences {
    // Reference type can be assigned null
    String a = null;
    // Reference type have some methods
    boolean b = a.isEmpty();

    static int i, i1, i2 = 5;

    public static void main(String[] args) {
        System.out.println(i1);
    }
}
