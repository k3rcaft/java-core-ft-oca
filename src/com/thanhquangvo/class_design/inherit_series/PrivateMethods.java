package com.thanhquangvo.class_design.inherit_series;

/**
 * When a method is private which cannot override, hiding
 * It's just use in it own class
 * Therefore, Java permits redeclare this method in subclass
 */
public class PrivateMethods {
}

class Parent {
    private void name() { }
}

class Child extends Parent {

    // redeclare not override not hiding
    private void name() {}
}
