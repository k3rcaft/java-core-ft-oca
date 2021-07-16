package com.thanhquangvo.methods_and_encapsulation;

public class Varargs {

    /**
     * just 1 vararg in methods
     * it must be last param
     * if when call methods and not pass it, Java will automatically pass new array empty in
     */
    public static void main(String[] args) {
        vararg(10);
        vararg(20, 10, 20, 30);
    }

    static void vararg(int input, int... optionalInput) {
        System.out.print(input);
        System.out.println(optionalInput.length);
    }
}
