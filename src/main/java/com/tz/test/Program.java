package com.tz.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.HashAttributeSet;

import com.sun.javafx.collections.MappingChange.Map;

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
		listint.forEach(x -> System.out.println(x.toString()));
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		listint.stream().map(x -> {
			int a = 3;
			int d = 4;
			String strrr = (a + b +x).toString();
			return strrr;
		});
		//liststr.stream().filter(predicate)

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
