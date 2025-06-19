package com.pack.backup;


//---Non paratmeterized constructor
/*class Employee{
     int id;
     String name;
	 Employee(){
		id =1;
		name="kavya";
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
}
public class Constructor1 {
	public static void main (String args[]) {
	Employee e1=new Employee();
	e1.display();
}
}
/*
 

// parameterized constructor
/*
package com.pack.backup;

class Employee{
     int id;
     String name;
	 Employee(int id,String name){
		id =id;
		name=name;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
	
}
public class Constructor1 {
	public static void main (String args[]) {
	Employee e1=new Employee(101,"kavya");
	e1.display();
}
}*/


//this keyword - invoke method
/*
class Employee{
     void sleep() {
    	 System.out.println("Sleeping");
     }
     void read() {
    	 sleep();//this.sleep();
    	 System.out.println("Reading");
     }
	
}
public class Constructor1 {
	public static void main (String args[]) {
	Employee e1=new Employee();
	e1.read();
}
}
*/


// Invoke Current Constructor
/*class Employee{
	Employee(){
		System.out.println("I am no parameterized");
	}
    Employee(int id){
    	this();//this is used instead of class name
    	System.out.println("I am  parameterized");
    }
	
}
public class Constructor1 {
	public static void main (String args[]) {
	Employee e1=new Employee(101);
	
}
}*/

//Invoke Current Constructor calling parameterized constructor in non parameterized constructor
/*class Employee{
	Employee(){
		this(101);
		System.out.println("I am no parameterized");
	}
 Employee(int id){

 	System.out.println("I am  parameterized");
 }
	
}
public class Constructor1 {
	public static void main (String args[]) {
	Employee e1=new Employee();
	
}
}*/


//Invoke Current Constructor
class Employee{
	
	int id;
	String name;
	int age;
	Employee(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		display();
	}
	void display(){
 	
 	System.out.println("id : "+id);
 	System.out.println("name : "+name);
 	System.out.println("age : "+age);
	System.out.println("======================================");
   }
	
}
    public class Constructor1 {
	public static void main (String args[]) {
	Employee e1=new Employee(101,"kavya",21);
	Employee e2=new Employee(102,"anu",22);
	
}
}









