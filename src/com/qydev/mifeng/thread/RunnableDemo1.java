package com.qydev.mifeng.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Test;

class Work implements Runnable {
	//int count = 0;
	Integer count = 0;
	int idx = 0;
	// sychronized int count = 0;
//	 public void add(){
//		 ++count;
//	 }
	 public  void add(){
		 ++count;
	 }
	 public void minus(){
		 --count;
	 }
	 public  void print(){
		 int index = 0;
		 
		 System.out.println("thread "+Thread.currentThread().getName()+" says welcome to china for times "+(idx++));
		 System.out.println("thread "+Thread.currentThread().getName()+" says welcome to china for times "+(idx++));
	 }
	Lock lock = new ReentrantLock();
	
	 public synchronized void loop(){
		// lock.lock();
		 try{
			 for(int i = 0; i<3; ++i){
					add();
					//minus();
//					System.out.println("thread "+Thread.currentThread().getName() 
//							+" is working " +i+"after add couter is " +(++count));
					System.out.println("thread "+Thread.currentThread().getName() 
							+" is working " +i+" couter is " +(count));
		 }
		
		 }finally{
			// lock.unlock();
		 }
//		 for(int i = 0; i<3; ++i){
//				add();
//				//minus();
////				System.out.println("thread "+Thread.currentThread().getName() 
////						+" is working " +i+"after add couter is " +(++count));
//				System.out.println("thread "+Thread.currentThread().getName() 
//						+" is working " +i+" couter is " +(count));
//	 }
	 }
	 //Lock lock = new ReentrantLock();
	@Override
	public void run() {
//		for(int i = 0; i<3; ++i){
//			System.out.println("thread "+Thread.currentThread().getName() 
//					+" is working " +i+" couter is " +(++count));
//		}
//		
//	}
//	synchronized(this){
//		for(int i = 0; i<3; ++i){
//			System.out.println("thread "+Thread.currentThread().getName() 
//					+" is working " +i+" couter is " +(++count));
//		}
//	}
//	synchronized(this){
//		for(int i = 0; i<3; ++i){
//			add();
//			//minus();
//			System.out.println("thread "+Thread.currentThread().getName() 
//				+" is working " +i+" couter is " +(count));
//		}
//	}
//	synchronized(this){
//		for(int i = 0; i<3; ++i){
//			add();
//			minus();
//			System.out.println("thread "+Thread.currentThread().getName() 
//					+" is working " +i+" couter is " +(++count));
//		}
//	}
	
//		for(int i = 0; i<3; ++i){
//			add();
//			//minus();
////			System.out.println("thread "+Thread.currentThread().getName() 
////					+" is working " +i+"after add couter is " +(++count));
//			System.out.println("thread "+Thread.currentThread().getName() 
//					+" is working " +i+" couter is " +(count));
//		}
//		synchronized(this){
//			for(int i = 0; i<3; ++i){
//				add();
//				//minus();
////				System.out.println("thread "+Thread.currentThread().getName() 
////						+" is working " +i+"after add couter is " +(++count));
//				System.out.println("thread "+Thread.currentThread().getName() 
//						+" is working " +i+" couter is " +(count));
//			}
//		}
		
//		lock.lock();
//		try{
//			for(int i = 0; i<3; ++i){
//				add();
//				//minus();
////				System.out.println("thread "+Thread.currentThread().getName() 
////						+" is working " +i+"after add couter is " +(++count));
//				System.out.println("thread "+Thread.currentThread().getName() 
//						+" is working " +i+" couter is " +(count));
//			}
//		}finally{
//			lock.unlock();
//		}
//		print();	
		loop();
		
		
		
		
//		add();
//		//minus();
////		System.out.println("thread "+Thread.currentThread().getName() 
////				+" is working " +i+"after add couter is " +(++count));
//		System.out.println("thread "+Thread.currentThread().getName() 
//				+" is working " +" couter is " +(count));
		
//			add();
//			//minus();
////			System.out.println("thread "+Thread.currentThread().getName() 
////					+" is working " +i+"after add couter is " +(++count));
//			System.out.println("thread "+Thread.currentThread().getName() 
//					+" is working " +" couter is " +(count));
//		//}
		
}
	
	
		

}
class A extends Thread {
	private String threadName;
	public A(){
		
	}
	public A(String name){
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
				//minus();
//				System.out.println("thread "+Thread.currentThread().getName() 
//						+" is working " +i+"after add couter is " +(++count));
				System.out.println("threads "+Thread.currentThread().getName()
						+" is working " +i+" couter is " +(count));
	}
	
}
}
public class RunnableDemo1  {
	@Test
	public void test(){
		Work work = new Work();
		
//		Thread thread1 = new Thread(work, "thread-1");
//		Thread thread2 = new Thread(work, "thread-2");
		Thread thread1 = new Thread(work, "thread-1");
		Thread thread2 = new Thread(new Work(), "thread-2");
		
		thread1.start();
		thread2.start();
		//A a = new A();
		
//		A mythread11 = new A("mythread11");		
//		A mythread12 = new A("mythread12");
//		A mythread3 = new A("ss");
//		A mythread4 = new A("4");
//		A mythread5 = new A("5");
////		A mythread = new A("mythread");
//		mythread11.start();
//	//	System.out.println();
//		mythread12.start();
//		mythread3.start();
//		mythread4.start();
//		mythread5.start();
		//A mythread = new A("mythread");
//		A mythread = new A();
//		Thread mythread1 = new Thread(mythread, "thread1");
//	    Thread mythread2 = new Thread(mythread, "thread2");
//		mythread1.start();
//		mythread2.start();
//		
		
	}

}
