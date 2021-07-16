package com.thanhquangvo.methods_and_encapsulation;

/**
 * Static method -> call -> static method or variable - legal - use classname
 * Static method -> call -> instance method or variable - not legal
 * Instance method -> call -> static method or variable - legal - use classname or a reference variable
 * Instance method -> call -> another instance method or variable - legal - use a reference variable
 */
public class StaticVSInstance {

    static int staticVar = 10;
    int instanceVar = 20;

    void instanceMethod () {
        System.out.println(staticVar);
        System.out.println(instanceVar);
        staticMethod();
    }

    static void staticMethod() {
//        instanceMethod ();
//        System.out.println(instanceVar);
        System.out.println(staticVar);
    }
}
