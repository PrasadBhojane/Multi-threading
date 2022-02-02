package com.deadlock;

class A
{
	public synchronized void d1(B b) //synchronized
	{
		System.out.println("Thread 1 starts execution of d1() method");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {}
		System.out.println("Thread 1 trying to call B's last() method");
		b.last();
	}
	public synchronized void last() //synchronized
	{
		System.out.println("Inside a, this is last() method");
	}
}
class B
{
	public synchronized void d2(A a) //synchronized
	{
		System.out.println("Thread 2 starts execution of d2() method");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread 2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last() //synchronized
	{
		System.out.println("Inside b, this is last() method");	
	}
}
public class Deadlock extends Thread
{
	A a = new A();
	B b = new B();
	public void m1()
	{
		this.start(); // ..line 1.. to start child thread
		a.d1(b); //This line executed by main thread.
	}
	public void run() // child thread is responsible to execute run() method.
	{
		b.d2(a);; // this line executed by child thread.
	}
	public static void main(String[]args) // default main thread born
	{
		Deadlock d = new Deadlock(); //child thread born
		d.m1(); // check line 1 to start child thread
	}
}
/**
 * learning deadlock- we can't fix it but can prevent it.
 * synchronized keyword is the only reason for deadlock situation.
 * If we remove at least one synchronized keyword from above program then the program won't enter into deadlock.
 * durga vid no.89
 */
