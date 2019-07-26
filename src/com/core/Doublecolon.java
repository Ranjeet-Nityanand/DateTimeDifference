/**
 * 
 */
package com.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ranjeet
 *
 */

interface Interf {
	public void m1();
}
public class Doublecolon {
	public static void m2() {
		System.out.println("Double Colon Method Reference static method");
	}

	public void m3() {
		System.out.println("Double Colon Method Reference instance method");
	}

	public void m4() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Class Thread");
		}
	}

	public static void main(String[] args) {
		Doublecolon d = new Doublecolon();
		Interf i = Doublecolon::m2;
		i.m1();

		Interf i1 = d::m3;
		i1.m1();

		Runnable r = d::m4;
		Thread t = new Thread(r);
		t.start();
		for (int j = 0; j <= 10; j++) {
			System.out.println("Main Class Thread");
		}

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(2);
		l.add(3);
		l.add(89);
		l.add(33);
		l.add(23);
		l.add(100);
		System.out.println(l);

		// copy to Integer Array

		Integer[] integ = l.stream().toArray(Integer[]::new);
		for (Integer x : integ) {
			System.out.println(x);
		}
		// Streams Filter

		List<Integer> l1 = l.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);

		// Streams Min value

		Integer integer = l.stream().min((i3, i2) -> i3.compareTo(i2)).get();
		System.out.println("min=>" + integer);

		// Stream max Class

		Integer inte = l.stream().max((i4, i5) -> i4.compareTo(i5)).get();
		System.out.println("max->" + inte);

		// Stream map double the value

		List<Integer> l2 = l.stream().map(L -> L * 2).collect(Collectors.toList());
		System.out.println(l2);

		List<String> l3 = new ArrayList<>();
		l3.add("Ranjeet");
		l3.add("Nityanand");
		l3.add("Sudhir");
		l3.add("Raj");
		l3.add("Kar");

		// String value size >=4

		List<String> l4 = l3.stream().filter(K -> K.length() >= 4).collect(Collectors.toList());
		System.out.println(l4);

		// Count Filtered String

		long count = l3.stream().filter(J -> J.length() >= 4).count();
		System.err.println(count);

		// Convert To Upper Case

		List<String> l5 = l3.stream().map(P -> P.toUpperCase()).collect(Collectors.toList());
		System.out.println(l5);
		List<String> l6 = l3.stream().sorted((m1, m2) -> m1.compareTo(m2)).collect(Collectors.toList());
		l6.forEach(System.out::println);
		l6.forEach(s -> System.out.println(s));

		Stream<Integer> s = Stream.of(1, 4, 6, 33, 67, 75);
		// s.forEach(lm -> System.out.println(lm));
		s.forEach(System.out::println);
	}
}
