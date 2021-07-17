package com.thanhquangvo.class_design.inherit_series;

public class HidingVSOverride {

}

class Human {

    public static String name() {
        return "Human";
    }

    public int age() {
        return 10;
    }

    public void description() {
        System.out.println(name().concat(" ") + age());
    }
}

class David extends Human {

    /**
     * hidden just change parent's behavior
     * not modify value of its parent (line 10 in file)
     * therefore, when we call description method value of name is not change
     */
    public static String name() {
        return "David";
    }

    public static void main(String[] args) {
        David david = new David();
        david.description();
        david.davidDescription();
    }

    /**
     * When runtime override will pass this method to parent's method
     * modify value of its parent (line 14)
     * Therefore, when we call description age is modified
     */
    @Override
    public int age() {
        return 20;
    }

    public void davidDescription() {
        System.out.println(name().concat(" ") + age());
    }
}
