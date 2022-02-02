package com.multithreading;

class MyThread1 extends Thread //Overloading of Run Method 
{
	public void run() // No argument run method
	{
		System.out.println("No-arg Run");
	}
	public void run(int i)//With argument Run Method
	{
		System.out.println("int-arg Run");
	}
}

public class Test 
{
	public static void main (String[]args)
	{
		MyThread1 t = new MyThread1();
				t.start();
	}
}

/**
* Overloading of the 'run method' in multithreading.
* Overloading is possible of the Run method, but thread class 'start()' will always call no argument 'run()' only
* while other 'run(int i)' method we have to call explicitly.
* durga vid no. 79
*/