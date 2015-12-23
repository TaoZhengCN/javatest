package com.tz.test;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		testReflection();
		// testGeneric();
	}

	private static void testReflection() {
		Person p = new Person();
		System.out.println(p.getClass().getName());
	}

	private static void testGeneric() {
		System.out.println("aksdkka''asd''");
		String b = "dddddd";
		int n = 0;
		List<String> liststr = test(b);
		List<Integer> listint = test(n);
	}

	public static List<Integer> dosomething() {
		List<Integer> li = new ArrayList<Integer>();
		return li;
	}

	public static <T> List<T> test(T t) {
		// 现在T是什么类型谁都不知道,编译器在编译的时候也是不知道的,只有在runtime时才知道
		List<T> l = new ArrayList<T>();
		l.add(t);
		System.out.println(t);
		return l;
	}
}
