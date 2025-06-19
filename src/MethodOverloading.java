package com.pack.backup;


class Employee1{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,double b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee1 e=new Employee1();
     e.add(2, 3);
     e.add(3, 9.20);
     e.add(2,3,4);
     
	}

}
