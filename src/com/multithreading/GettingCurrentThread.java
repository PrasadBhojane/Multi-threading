package com.multithreading;

class MyThread4 extends Thread //Getting current thread name
{
	public void run()
	{
		System.out.println("Run method is executed by Thread=" +Thread.currentThread().getName()); //executed by child thread
	}
}

public class GettingCurrentThread //Getting current thread name
{
	public static void main(String[]args)
	{
		MyThread4 t = new MyThread4();
		t.start();
		System.out.println("Main method is executed by Thread="+Thread.currentThread().getName()); //executed by main thread
	}
}
/**
 * Getting name of current thread by using Thread.currentThread() method
 * Durga vid no. 80
 */