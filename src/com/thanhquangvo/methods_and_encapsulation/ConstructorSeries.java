package com.thanhquangvo.methods_and_encapsulation;


/**
 * Order of Initialization
 * If there is a superclass, initialize it first
 * Static variable declarations and static initializers in the order they appear in the file (because it is class scope).
 * Instance variable declarations and instance initializers in the order they appear in the file (when create new instance, it's instance scope).
 * constructor
 */
public class ConstructorSeries {
    final int input3;
    int input;
    int input2;

    public ConstructorSeries(int input, int input2) {
        this.input = input;
        this.input2 = input2;
        // input 3 final variable must assign value before constructor is complete
        this.input3 = 30;

        System.out.println("this is constructor");
    }

    {
        System.out.println("initialization block");
    }

    public ConstructorSeries() {
        //this() must be first line
//        System.out.println(); => if this line is exist this() will compile error
        this(10, 20);
    }

    public static void main(String[] args) {
        System.out.println("prepare init");
        ConstructorSeries constructorSeries = new ConstructorSeries();
        System.out.println(constructorSeries.input);
    }

    static {
        System.out.println("static initialization block");
    }
}

/**
 * Java automatically create default empty constructor if you have not
 * If you have a any constructor Java will not add default constructor
 */
class NotHaveConstructorManual {

    /*
     * public NotHaveConstructorManual() {}
     */
}

