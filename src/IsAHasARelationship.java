package Basic;



    //"Is-a" means Inheritance.
    //"Has-a" means one class contains another class as a field or member.




// IS-A Relationship Example (Inheritance)
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// Dog IS-A Animal (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// HAS-A Relationship Example (Composition)
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

// Car HAS-A Engine
class Car {
    Engine engine = new Engine(); // HAS-A relationship

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

public class IsAHasARelationship {
    public static void main(String[] args) {
        // IS-A example
        Dog dog = new Dog();
        dog.makeSound(); // inherited from Animal
        dog.bark();      // own method

        System.out.println("-----");

        // HAS-A example
        Car car = new Car();
        car.drive();     // uses Engine inside Car
    }
}
