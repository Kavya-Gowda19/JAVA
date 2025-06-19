package com.pack.backup;


//calling through child classs
//Single Inheritance
/*
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog(); //child to call parent methood
        d.eat();
        d.bark();
    }
}
*/

/*	
//Multilevel Inheritance	
	class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

	*/	
		
//Hirearchal inheritance
		
/*		
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}*/

//Multiple Inheritance through interface

/*interface Animal {
    void eat();
}

interface Pet {
    void play();
}

// Class inherits from both interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void play() {
        System.out.println("Dog is playing.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // From Animal interface
        d.play();  // From Pet interface
    }
}*/
interface Animal {
    default void eat() {
        System.out.println("Animal is eating (default).");
    }
}

interface Pet {
    default void play() {
        System.out.println("Pet is playing (default).");
    }
}

class Dog implements Animal, Pet {
    // You can override if you want
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void play() {
       System.out.println("Dog is playing.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Uses Dog's method
        d.play();  // Uses Dog's method
    }
}

