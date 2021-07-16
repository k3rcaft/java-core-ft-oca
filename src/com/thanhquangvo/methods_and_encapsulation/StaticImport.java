package com.thanhquangvo.methods_and_encapsulation;

import java.util.List;

import static java.lang.Integer.MIN_VALUE;
import static java.util.Arrays.asList;
//error import which MIN_VALUE you wanna use
//import static com.thanhquangvo.methods_and_encapsulation.StaticClass.MIN_VALUE;
//rule import like import classes package

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(MIN_VALUE);
        List<Integer> list = asList(1, 2, 3, 4);
    }
}

class StaticClass {
    static Integer MIN_VALUE = 20;
}
