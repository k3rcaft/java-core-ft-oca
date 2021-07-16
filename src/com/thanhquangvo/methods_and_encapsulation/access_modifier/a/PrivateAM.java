package com.thanhquangvo.methods_and_encapsulation.access_modifier.a;

public class PrivateAM {

    private void privateMethod() {
        System.out.println("The class can see this method");
    }

    public static void main(String[] args) {
        PrivateAM privateAM = new PrivateAM();
        privateAM.privateMethod();
    }
}
