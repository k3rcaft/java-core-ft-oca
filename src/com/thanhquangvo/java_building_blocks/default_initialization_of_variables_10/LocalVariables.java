package com.thanhquangvo.java_building_blocks.default_initialization_of_variables_10;

// Local variables must be initialized before use
public class LocalVariables {

    void localMethod() {
        int x;
        // if not have line assigned value for x, the program will throw compile error
        x = 5;
        System.out.println(x);
    }
}
