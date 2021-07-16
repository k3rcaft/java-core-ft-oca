package com.thanhquangvo.methods_and_encapsulation;

public class ImmutableClassDesign {

    private final String input;

    public ImmutableClassDesign(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
