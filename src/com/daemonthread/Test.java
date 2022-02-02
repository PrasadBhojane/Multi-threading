package com.daemonthread;

class MyThread extends Thread
{
}
public class Test 
{
	public static void main(String[]args)
	{
		System.out.println(Thread.currentThread().isDaemon()); // false
	    //Thread.currentThread().setDaemon(true); //RE: IllegalThreadStateException
		MyThread t= new MyThread(); //child thread born
		System.out.println(t.isDaemon()); //false
		t.setDaemon(true);
		System.out.println(t.isDaemon()); //true
	}
}
/**
 * by default Main thread is always non-daemon and its not possible to change its nature to daemon.
 * durga vid no. 90
 * example of daemon thread: Garbage collector
 * purpose of Daemon thread is to provide support for Non Daemon thread.
 */
