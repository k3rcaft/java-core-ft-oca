package com.thanhquangvo.java_building_blocks;

public class DestroyingObjects_13 {

    public static void main(String[] args) {
        // Suggest Java Garbage Collection run
        // it is not guarantee will run
        System.gc();
    }

    //This
    //method gets called if the garbage collector tries to collect the object. If the garbage collector
    //doesn’t run, the method doesn’t get called.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
