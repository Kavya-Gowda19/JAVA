package com.pack.backup;

class Students{
	int id;
	String name;
	Students(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Employee3 extends Students{
	double salary;
	Employee3(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}

public class ReuseConstructorUsingSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 e=new Employee3(1,"kavya",900000);
		e.display();

	}

}
