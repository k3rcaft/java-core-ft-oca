package com.thanhquangvo.javabuildingblocks.referencees_vs_primitives_8;

// a reference type refers to an object (an instance of a class).
// a reference “points” to an object by storing the memory address
public class ReferenceTypes {
    // two way to assigned value for reference
    String a = "hello world";
    // A reference can be assigned to another object of the same type.
    String b = a;
    // A reference can be assigned to a new object using the new keyword.
    String c = new String("hello world");
}
