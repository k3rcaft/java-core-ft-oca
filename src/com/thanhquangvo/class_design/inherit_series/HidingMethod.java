package com.thanhquangvo.class_design.inherit_series;

/**
 * 1. The method in the child class must have the same signature as the method in the parent
 * class.
 * 2. The method in the child class must be at least as accessible or more accessible than the
 * method in the parent class.
 * 3. The method in the child class may not throw a checked exception that is new or
 * broader than the class of any exception thrown in the parent class method.
 * 4. If the method returns a value, it must be the same or a subclass of the method in the
 * parent class, known as covariant return types.
 * 5. The method defined in the child class must be marked as static if it is marked as
 * static in the parent class (method hiding). Likewise, the method must not be marked
 * as static in the child class if it is not marked as static in the parent class (method
 * overriding).
 */
public class HidingMethod {

}

class Bear {

    protected static void eat() {
        System.out.println("Bear is eating");
    }

    protected void bite() {
        System.out.println("Bear is eating");
    }

    protected void action() {
        eat();
    }

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.action();
    }
}

class Panda extends Bear {

    public static void eat() throws IndexOutOfBoundsException {
        System.out.println("Panda is eating");
    }

    @Override
    protected void action() {
        eat();
    }

    public static void main(String[] args) {
        Panda panda  = new Panda();
        panda.action();
    }
}

class Tiger extends Bear {

    // compile error when decrease scope of subclass method: protected (superset) => default
//    static void eat() {}

    // compile error when try to hide a instance method
//    protected static void bite() { }

    // compile error when override a hiding method
//    protected void eat() {}

    // compile error when throw new Checked Exception
//        protected static void eat() throws IOException {}
}
