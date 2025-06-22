package com.pack.backup;



//thread example1
/*class mythread extends Thread{
	public void run() {
		System.out.println("I will execute wheneven thread starts");
		
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       mythread t1=new mythread();
       t1.run();
	}

}*/

//one to ten thread

class mythread1 extends Thread{
	public void run() {
		System.out.println("I will execute wheneven thread starts");
		for(int i=0;i<+10;i++) {
			System.out.println(i);
		}
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       mythread1 t1=new mythread1();
       t1.run();
	}

}

