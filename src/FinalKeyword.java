package com.pack.backup;
//Final Variable
/*class Bike1{
	final int speed = 120;
	void display() {
		// speed = 300; // Reassigning a final variable → Compilation error
		int speed = 200; // Redeclaring a new local variable → Allowed
		System.out.println(speed); // Prints 200 (local variable)
	}
}
// 

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Bike1  b1=new Bike1();
           b1.display();
	}

}

*/
//Final Method

class A{
	//final void read() {
	    void read() {
		System.out.println("Hi");
		
	}
}
class B extends A{
	void read() {
		System.out.println("Bye");
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
      B b=new B();
      b.read();
	}
}
/*A final method cannot be overridden.
A final class cannot be extended.
A final variable cannot be reassigned.*/
