package com.thanhquangvo.class_design.inherit_series;

//        1. The first statement of every constructor is a call to another constructor within the class
//        using this(), or a call to a constructor in the direct parent class using super().
//        2. The super() call may not be used after the first statement of the constructor.
//        3. If no super() call is declared in a constructor, Java will insert a no-argument super()
//        as the first statement of the constructor.
//        4. If the parent doesn’t have a no-argument constructor and the child doesn’t define any
//        constructors, the compiler will throw an error and try to insert a default no-argument
//        constructor into the child class.
//        5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit
//        call to a parent constructor in each child constructor.
public class ConstructorDefinition {

}

class Animal {

    protected String name;
    private String type;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

// Case 1
// Java try to add a default no args constructor in class and super () in class
// But superclass need a constructor have args
// Compile will error
// class Duck extends Animal {}

// Case 2
//class Tiger extends Animal {

// compiler try insert super() default
// but super() default is not cover for its superclass
//    public Tiger() {}
//}

class Dog extends Animal {

    int age;

    public Dog(String name) {
        super(name);
        this.name = "LuLU";
    }

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Kiki");
        dog.call();
    }

    void call() {
        // "this" in child class point same property with "super" because child class be inherited super class
        // extend all fields and methods
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(this.getType());
        System.out.println(super.getType());

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(super.getName());
        // error because superclass have not age field
//        System.out.println(super.age);
    }
}
