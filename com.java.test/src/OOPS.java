import java.lang.reflect.Method;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name, int age){
        System.out.println(this.name);
        System.out.println(this.age);
    }




    // Non parametrized constructor
    // By default it is created 
    Student(){
        System.out.println("constructor called");
    }

    // parametrized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

// Superclass (Parent)
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass (Child) - Inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking!");
    }
}


public class OOPS {
    public static void main(String[] args) {
        // creating object of pen class
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ball point";
        // pen2.printColor();
        
        //Contructor is called while creating object
        // same name as class
        // no return type
        // one object only once constructor is called
        // new memory is allocated in memory heap as size of object
        // Student s1 = new Student();
        // s1.name = "james bond";
        // s1.age = 30;
        // s1.printInfo();
        // Student s2 = new Student("ironman",40);
        // s2.printInfo();
        // Student s3 = new Student(s1);
        // s3.printInfo();

        // four major concepts of oops
        // 1. abstraction
        // 2. encapsulation
        // 3. inheritance
        // 4. polymorphism

        // garbage collector in java is used as distructor by default

        //polymorphism
        //1. Method Overloading  -- compile-time polymorphism
        //2. Method Overriding -- run-time polymorphism

        // Method Overloading
        // Student s4 = new Student();
        // s4.name = "spider man";
        // s4.age = 40;
        // s4.printInfo(s4.name);
        // s4.printInfo(s4.age);
        // s4.printInfo(s4.name,s4.age);

        // inheritance

        Dog myDog = new Dog();

        // Inherited methods (from Animal)
        myDog.eat();
        myDog.sleep();

        // Child class method
        myDog.bark();
    }
}
