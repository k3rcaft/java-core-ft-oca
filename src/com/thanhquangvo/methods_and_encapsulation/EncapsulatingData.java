package com.thanhquangvo.methods_and_encapsulation;

public class EncapsulatingData {

}

class EncapsulationClass {
    private int numberEggs;
    private boolean happy;

    // name convention rules
    // boolean start with "is" when get
    public boolean isHappy() {
        return happy;
    }

    // set same rule
    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    // boolean start with "get" when get
    public int getNumberEggs() {
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {
        // set condition to improve security
        if (numberEggs >= 10) {
            this.numberEggs = numberEggs;
        }
    }
}
