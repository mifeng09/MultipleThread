package com.qydev.mifeng.thread;

public class ThreadTest {
	class A extends Thread {
		private String threadName;
		public A(String name){
			this.threadName = name;
		}
		private int count = 0;
		public  void add(){
			 ++count;
		 }
//		@Override
//		public void run(){
//			synchronized(this){
//				for(int i = 0; i<2; ++i){
//					add();
//					//minus();
////					System.out.println("thread "+Thread.currentThread().getName() 
////							+" is working " +i+"after add couter is " +(++count));
//					System.out.println("thread "+Thread.currentThread().getName() 
//							+" is working " +i+" couter is " +(count));
//		}
//		
//			}
			@Override
			public void run(){
				
					for(int i = 0; i<2; ++i){
						add();
						//minus();
//						System.out.println("thread "+Thread.currentThread().getName() 
//								+" is working " +i+"after add couter is " +(++count));
						System.out.println("thread "+Thread.currentThread().getName() 
								+" is working " +i+" couter is " +(count));
			
			
				}
//			 for(int i = 0; i<2; ++i){
//					add();
//					//minus();
////					System.out.println("thread "+Thread.currentThread().getName() 
////							+" is working " +i+"after add couter is " +(++count));
//					System.out.println("thread "+threadName 
//							+" is working " +i+" couter is " +(count));
//		}
		
		}
	}
//private A a;
	public static void main(String[] args) {
//		ThreadTest test = new ThreadTest();
//		A mythread = test.new A("mythread");
//		//A mythread = new A("mythread");
//		Thread mythread1 = new Thread(mythread, "thread1");
//	    Thread mythread2 = new Thread(mythread, "thread2");
//		mythread1.start();
//		mythread2.start();
		ThreadTest test = new ThreadTest();
		A mythreads1 = test.new A("mythreads1");
		A mythreads2 = test.new A("mythreads2");
		mythreads1.start();
		mythreads2.start();
		
		
	}

}

