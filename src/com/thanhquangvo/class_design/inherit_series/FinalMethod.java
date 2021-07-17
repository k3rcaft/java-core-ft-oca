package com.thanhquangvo.class_design.inherit_series;

/**
 * when mark final the method is not override or hiding
 * you use this when want to persist the logic of parent for each of subclass
 */
public class FinalMethod {

}

class IPhone {

    final String systemOS() {
        return "iOS";
    }
}

class IPhone6 extends IPhone {

    public static void main(String[] args) {
        IPhone6 iPhone6 = new IPhone6();
        System.out.println(iPhone6.systemOS());
    }
}

class IPhone12 extends IPhone {

    public static void main(String[] args) {
        IPhone12 iPhone12 = new IPhone12();
        System.out.println(iPhone12.systemOS());
    }
}

