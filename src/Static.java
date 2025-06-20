package com.pack.backup;

//static variable
/*class customer{
	static String ifcode="12bbsuws822";
	String name;
	
	customer(String name){
		this.name=name;
		dis();
	}
	
	void dis() {
		System.out.println(name);
		System.out.println(ifcode);
	}
}
public class StaticKeyword {
	public static void main(String[] ll00) {
		// TODO Auto-generated method stub
		customer c1=new customer("sb");
		customer c2=new customer("hdfc");
		customer c3=new customer("baroda");		
		System.out.println("using class we can acess static variable "+customer.ifcode);		
	}
}*/

// static method

class customer{
	static void sleep() {
		System.out.println("hi");
	}
	static void read() {
		System.out.println();
	}
	public class statickeyword{
		public static void main(String args[]) {
			customer.sleep();
		}
		
	}
}


	


