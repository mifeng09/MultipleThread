package com.qydev.mifeng.thread;

import org.junit.Test;

/**
 * 练习使用多线程
 * @author 21405
 *@see http://www.mamicode.com/info-detail-517008.html
 */
public class ThreadDemo  implements Runnable {
    private String threadName;
    public ThreadDemo(){
    	
    }
    public ThreadDemo(String threadName){
    	this.threadName = threadName;
    }
	@Override
	public void run() {
		for(int i = 0; i<5;i++){
			System.out.println(threadName + " is running" + i);
		}
	}
	
//	@Test
//	public void test(){
//		ThreadDemo thd1 = new ThreadDemo("A");
//		ThreadDemo thd2 = new ThreadDemo("B");
//		Thread th1 = new Thread(thd1);
//		Thread th2 = new Thread(thd2);
//		th1.start();
//		th2.start();
//	
//	}
	public static void main(String[] args){
//		ThreadDemo thd1 = new ThreadDemo("A");
//		ThreadDemo thd2 = new ThreadDemo("B");
//		Thread th1 = new Thread(thd1);
//		Thread th2 = new Thread(thd2);
//		th1.start();
//		th2.start();
		Runnable runnable = new Runnable(){

			@Override
			public void run() {
				System.out.println("welcome");
				for(int i = 0; i<5;i++){
					System.out.println( Thread.currentThread().getName() + " is running");
				}
			}
			
		};
		for(int i = 0; i<2;i++){
			new Thread(runnable,"threads"+i).start();;
		}
		
	}

}
