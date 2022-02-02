package com.multithreading;

class MyThread0 extends Thread
{

}
public class ThreadPriority 
{
	public static void main(String[]args)
	{
		System.out.println(Thread.currentThread().getPriority()); //Output: 5	
		//Thread.currentThread().setPriority(15); //RE: IllegalArgumentException
		Thread.currentThread().setPriority(8);
		MyThread0 t = new MyThread0();
		System.out.println(t.getPriority()); //Output = 8
	}
}
//**RANGE OF THREAD PRIORITIES IS '1 TO 10'
//max priority to execution will be thread priority 10 and min priority will to 1.
//The default priority only for the main thread is 5, but for all remaining thread it will be reheriting from parent.
//i.e. whatever priority parent has same priority will be inheriting to the child.
//Durga vid no. 81