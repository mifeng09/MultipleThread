package com.qydev.mifeng.thread;

class B extends Thread {
private String threadName;
		public B(){
			
		}
		public B(String name){
			this.threadName = name;
		}
		private int count = 0;
		public  void add(){
			 ++count;
		 }
		 	@Override
			public void run(){
					for(int i = 0; i<2; ++i){
						add();
						System.out.println("thread "+Thread.currentThread().getName() 
								+" is working " +i+" couter is " +(count));
	
				}
		}
}
public class RunnableDemo  {
	
	public static void main(String[] args){
		//Work work = new Work();
		B mythread11 = new B("mythread11");		
		B mythread12 = new B("mythread12");
		B mythread13 = new B();
		mythread11.start();
		mythread12.start();
		mythread13.start();
	}
}