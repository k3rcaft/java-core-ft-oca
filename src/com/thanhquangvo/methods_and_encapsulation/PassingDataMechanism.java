package com.thanhquangvo.methods_and_encapsulation;

public class PassingDataMechanism {

    // Java is a “pass-by-value” language. This means that a copy of the variable is made and the
    //method receives that copy
    static void passingDataByValue(int input, int input2) {
        int temp = input;
        input = input2;
        input2 = temp;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // a & b just pass its value in methods
        // a&b -> java create copy of a&b as a1, b2 -> passingDataByValue(a1, b1) { handle a1 & b1}
        // therefore -> after all, method is complete -> value of a&b are not change
        passingDataByValue(10, 20);
        System.out.println(a);
        System.out.println(b);
    }
}
