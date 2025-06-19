package com.pack.backup;

/*class student{
	void read() {
		System.out.println("he will read from book");
	}
}
class Employee3 extends student{
	void read() {
		super.read();//Invoke current parent method
		System.out.println("he will read from chatgpt");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employee3 e=new Employee3();
  e.read();
  
	}

}*/

class Bike{
	String color="red";
}
	class Honda extends Bike{
		String color="Blue";
		void display() {
			System.out.println(color);
			System.out.println(super.color);
		}
	}

	public class SuperKeyword {

		public static void main(String[] args) {
		Honda h=new Honda();
		h.display();
}
	}









