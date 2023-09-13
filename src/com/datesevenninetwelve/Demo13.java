package com.datesevenninetwelve;

//example of method reference

public class Demo13 {
	
	public void m2(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread" +Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Demo13 d=new Demo13();
		Runnable r=d::m2;
		
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread " +Thread.currentThread().getName());
		}
		
		
	}

}
