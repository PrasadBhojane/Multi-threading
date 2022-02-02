package com.multithreading;

class MyThread2 extends Thread 
{
	public void start()
	{
		System.out.println("Start Method");
	}
	public void run()
	{
		System.out.println("Run Method");
	}
}

class OverrideStartMethod  
{
	public static void main(String[]args)
	{
		MyThread2 t = new MyThread2();
		t.start();
		System.out.println("Main Method");
	}
}

/**
 * durga vid no. 79
 * overriding of start()
 * If we override start() then start() will be executed as just like normal method call & no new thread will be created.
 * total output will be produced by only main thread.
 * It is not recommended to override start (), otherwise dont go for multithreading concepts.
*/