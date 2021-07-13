package com.thanhquangvo.javabuildingblocks;

//object is an instance of a class
public class CreatingObject_7 {

    //constructor despite have access modifier
    //constructor is always not the return type
    CreatingObject_7() {

    }

    int number = 0;

    //it is not constructor of the class
    public void SomeObject() {
        System.out.println("this is constructor");
    }

    {
        System.out.println("this is instance initializer");
        // this instance initializer do not refer the b instance because order of them is cannot permit;
    }

    int b = 0;
}

// Order of Initialization
// Fields and instance initializer blocks are run in the order in which they appear in the file.
// The constructor runs after all fields and instance initializer blocks have run
