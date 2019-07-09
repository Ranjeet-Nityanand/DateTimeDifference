package com.core;

public class MultipleInheritance implements A, B {
	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.show();

	}

	public void show()
	{
		B.super.show();
}


}

class MainClass {
	public static void main(String[] args) {
		System.err.println("2nd class Main method");
	}
}
interface A {
	default void show() {
		System.err.println("Interface A sop");
	}
}

interface B {
	default void show() {
		System.err.println("Interface B sop");
	}
}

class C {
	public void disp() {
		System.err.println("Class C method");
	}
}

abstract class D {
	int a;
	public void disp() {
		System.err.println("Class D method");
	}
	 

	public abstract void display();

	public D() {

	}
}

interface Main {

	static void diss() {
		System.err.println("static methods");
	}

	default void defaultMethod() {
		System.err.println("Default Method");
	}
	public static void main(String[] arg) {
		System.err.println("Interface Methods");
		Main.diss();

	}
}

interface Main2 {
	static void mainMethod() {
		System.err.println("==In main2 interface Method");
	}
	public static void main(String[] args) {
		System.out.println("Main method in 2nd interface");
		Main2.mainMethod();
	}
}