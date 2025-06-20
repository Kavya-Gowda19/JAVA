package com.pack.backup;

public class mainmethodoverloading {

	public static void main(String[] args) {
		
		main(10);
		main(10.3,30);
		// TODO Auto-generated method stub

	}
	public static void main(int a) {
		
	System.out.println(a);
	}
	public static void main(double a,int b) {
		
		System.out.println(a+b);
		}

}
