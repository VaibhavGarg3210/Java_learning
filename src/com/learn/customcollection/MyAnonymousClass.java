package com.learn.customcollection;

public class MyAnonymousClass {
	
	public static void main(String args[]) {
	
	Thread t = new Thread() {
		
	};
	
	Runnable r =new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.err.println("Thread Child");
			}
			
		}
	};
	Thread t2 = new Thread(r);
	t2.start();
	for(int i=0;i<10;i++) {
		System.err.println("Thread Parent	");
	}
	}

}
