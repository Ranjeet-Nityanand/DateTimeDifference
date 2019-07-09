package com.core;

public class JavaEight implements Def {

	public static void main(String[] args) {
		JavaEight j = new JavaEight();
		j.show();
		j.display();
		j.show();
		Abc ab = (a, b) -> {
			System.out.println("Lemda Expression" + (a + b));
		};
		ab.show(5, 6);
		
		Def.dis();


	}

	public void show() {
		System.out.println("Hii This is Test Message");
		Def.super.display();

	}

	@Override
	public void show(int a, int b) {


	}


}

@FunctionalInterface
interface Abc {

	void show(int a, int b);

	static void dis() {
		System.err.println("Static Method");

	}

	default void display() {
		System.out.println("Default Method");
	}
}

@FunctionalInterface
interface Def extends Abc {
	void show(int a, int b);
	static void dis() {
		System.err.println("Static Method overridden");

	}

	default void display() {
		System.out.println("Default Method overridden");
	}
}