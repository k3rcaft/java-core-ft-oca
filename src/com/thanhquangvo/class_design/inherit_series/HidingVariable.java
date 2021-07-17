package com.thanhquangvo.class_design.inherit_series;

public class HidingVariable {
}

class Rodent {
    protected int tailLength = 4;

    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }

}

class Mouse extends Rodent {
    protected int tailLength = 8;

    void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Rodent rodent = new Mouse();

        mouse.getRodentDetails();
        mouse.getMouseDetails();

        System.out.println(rodent.tailLength);
    }
}
