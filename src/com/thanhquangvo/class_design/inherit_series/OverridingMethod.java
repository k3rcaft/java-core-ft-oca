package com.thanhquangvo.class_design.inherit_series;

import java.io.EOFException;

/*
1. The method in the child class must have the same signature as the method in the parent
class.
2. The method in the child class must be at least as accessible or more accessible than the
method in the parent class.
3. The method in the child class may not throw a checked exception (not apply for other exceptions) that is new or
broader(super class is always broader than child class) than the class of any exception thrown in the parent class method.
4. If the method returns a value, it must be the same or a subclass of the method in the
parent class, known as covariant return types.
 */
public class OverridingMethod {
}

class Bird {

    protected void fly() {
        System.out.println("Bird is flying");
    }

    protected void eat(int food) {
        System.out.println("Bird is eating " + food + " units of food");
    }

    protected Object name() throws EOFException {
        return "default";
    }
}

class Eagle extends Bird {

    // overload
    // observe its params not return type
    public int fly(int height) {
        System.out.println("Bird is eating " + height + "  meters");
        return height;
    }

    // does not compile
//    public int eat(int food) {
//        System.out.println("Bird is eating " + food + " units of food");
//        return food;
//    }
}

class Owl extends Bird {

//    // violates the rule modifier of rule 2
//    @Override
//    private void fly() {
//        super.fly();
//    }

    public static void main(String[] args) {
        Owl owl = new Owl();
    }

    // violates rule 1 not same signature
//    @Override
//    public int name() {
//        return 5;
//    }


    //    // can apply more last rule, return type can be subclass of return type of superset's method
//    // Third rule => can ignore exception from super class
    @Override
    protected String name() {
        return "owl";
    }

    // not have rule for unchecked exception
//    @Override
//    protected String name() throws IndexOutOfBoundsException  {
//        return "owl";
//    }

    // modifier of method child must be  = or broader than parent class
    @Override
    public void fly() {
        super.fly();
    }

    // cannot throw new exception or broader exception
//    @Override
//    protected Object name() throws IOException {
//        return new Object();
//    }
}

