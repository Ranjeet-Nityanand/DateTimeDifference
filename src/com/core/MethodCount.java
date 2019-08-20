/**
 * 
 */
package com.core;

import java.lang.reflect.Method;

/**
 * @author Ranjeet
 *
 */
public class MethodCount {

	public static void main(String[] args)throws Exception {
		int i=0;
		Class c= Class.forName("java.lang.Comparable");
		Method[] declaredMethods = c.getDeclaredMethods();
	
		for(Method m: declaredMethods) {
			i++;
			System.out.println(m.getName());
		}
		System.err.println("Number of method is->"+i);
	}
}
