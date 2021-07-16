package com.thanhquangvo.methods_and_encapsulation;

import java.util.function.Function;

public class SimpleLambda {

    public static void main(String[] args) {
        simpleLambda();
    }

    static void simpleLambda() {
        Function<String, String> function = (input) -> input.concat("a");
        function.apply("hello");

        Function<String, String> function1 = (String input) -> {
            return input.concat("a");
        };
        function1.apply("hello");
    }
}
