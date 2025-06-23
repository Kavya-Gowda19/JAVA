package com.pack.backup;
class accessing{
	public accessing(){
		System.out.println("i will execute after the maain method get call");
	}
	static {
		System.out.println("i will execute before the maain method get call");
	}
}
public class accesssing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        accessing a=new accessing();
	}

}
