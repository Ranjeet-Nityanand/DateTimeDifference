/**
 * 
 */
package com.core;

import java.util.function.Predicate;

/**
 * @author Ranjeet
 *
 */
@FunctionalInterface
interface Lamda {

	// public int m1(String a);
	// public void m2();
	// public void m3(int a, int b);
	public int squareIt(int a);
}

class Test {
	public static void main(String[] args) {
		// Lamda l = a -> a.length();
		// System.err.println(l.m1("Ranjeet"));

		// Lamda l = p -> System.err.println(p.length());
		// l.m1("RanjeetNityanand");

		// Lamda l1 = () -> System.err.println("m2() method by Lamda Exp");
		// l1.m2();

		// Lamda l = (a, b) -> System.err.println(a + b);
		// l.m3(3, 7);
		// l.m3(100, 500);

		Lamda l = k -> {
			return k * k;
		};
		System.err.println(l.squareIt(5));

		// predicate to find greate number

		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		System.out.println(p.negate());
		// Predicate to compare String

		// Predicate<String> p1 = s -> s.equalsIgnoreCase("Ranjeet");
		// System.out.println(p1.test("ranjeet"));
		//
		// // Predicate to find even number
		//
		// Predicate<Integer> p2 = i -> i % 2 == 0;
		// if ((p2.test(110))) {
		// System.out.println("Even Number");
		// } else
		// System.out.println("odd Number");
		//
	}
}