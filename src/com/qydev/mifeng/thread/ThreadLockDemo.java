package com.qydev.mifeng.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    int count = 0;
    Lock lock = new ReentrantLock();
    public void add() {
        ++count;
    }
	
    @Override
    public void run() {
    	lock.lock();
        try{
        	add();
        	for (int i = 0; i < 3; ++i) {
                System.out.println("thread " + Thread.currentThread().getName() +
                    " is working " + i + " couter is " + (count));
            }
        }finally{
        	lock.unlock();
        }
        
    }
}

public class ThreadLockDemo {

	public static void main(String[] args) {
		
    Worker worker = new Worker();
    Thread thread1 = new Thread(worker, "thread-1");
    Thread thread2 = new Thread(worker, "thread-2");
    thread1.start();
    thread2.start();
	}

}
