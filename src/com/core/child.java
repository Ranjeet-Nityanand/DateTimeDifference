/**
 * 
 */
package com.core;

/**
 * @author Ranjeet
 *
 */
class Oops {

	public static void sum(int x) {
		System.out.println("int");
	}
	public void sum(String x) {
		System.out.println("String");
	}
	public void sum(double x) {
		System.out.println("Double");
		
	}
}

class child extends Oops  {
	
	public static void sum(int x) {
		System.out.println("Child Int");
	}
	@Override
	public void sum(String s) {
		System.out.println("Child Class String");
	}
	
	
	public static void main(String[] arg) {
	
		Oops o=new child();
		o.sum(7);
		child c=new child();
		c.sum(1);
	}
}

