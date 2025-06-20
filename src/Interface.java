package com.pack.backup;

/*interface notification{
	void alert();
}
class email implements notification{w
	public void alert() { //when overrided the method visibility should be public
		System.out.println("I wil get alert using email");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       email e=new email();
       e.alert();
	}

}*/


package com.pack.backup;

/*interface notification{
	void alert();
}
class email implements notification{w
	public void alert() { //when overrided the method visibility should be public
		System.out.println("I wil get alert using email");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       email e=new email();
       e.alert();
	}

}*/


//Define the interface
interface Animal {
 void sound(); // abstract method
 void eat();
}

//Implement the interface in a class
class Dog implements Animal {
 public void sound() {
     System.out.println("Dog barks");
 }

 public void eat() {
     System.out.println("Dog eats bones");
 }
}

//Another class implementing the same interface
class Cat implements Animal {
 public void sound() {
     System.out.println("Cat meows");
 }

 public void eat() {
     System.out.println("Cat eats fish");
 }
}

//Main class to run the code
public class Interface {
 public static void main(String[] args) {
     Animal d = new Dog();
     Animal c = new Cat();

     d.sound();
     d.eat();

     c.sound();
     c.eat();
 }
}



