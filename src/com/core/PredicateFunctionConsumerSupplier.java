/**
 * 
 */
package com.core;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Ranjeet
 *
 */

// Predicate (Functional Interface) join

public class PredicateFunctionConsumerSupplier {

	public static void main(String[] args) throws NullPointerException {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		// System.out.println(p.negate().test(100));
		Predicate<Integer> p1 = p.negate();
		System.out.println(p1.test(100));

		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println(p2.test(13));

		System.out.println(p2.and(p).test(12));
		System.out.println(p.or(p2).test(9));

		// Function (Functional Interface)

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Ranjeet"));

		Function<Integer, Integer> f1 = i -> i * i;
		System.out.println(f1.apply(5));

		// Consumer (Functional Interface)

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hii Ranjeet");

		Supplier<String> s1 = () -> {
			String[] s2 = { "Ranjeet", "Nityanand", "Sudhir", "Raj" };
			int i = (int) (Math.random() * 3 + 1);
			return s2[i];

		};
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());

		Supplier<Integer> I = () -> {
			int x, a;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Number");
			a = sc.nextInt();
			x = a * 10;
			sc.close();
			return x;
		};
		System.out.println(I.get());
	}
}
