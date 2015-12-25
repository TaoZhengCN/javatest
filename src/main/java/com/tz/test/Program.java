package com.tz.test;


import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class Program {

	public static void main(String[] args) {
		testReflection();
		// testGeneric();
	}

	private static void testReflection() {
		Person p = new Person();
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;

		try {
			c1 = Class.forName("com.tz.test.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c2 = p.getClass();
		c3 = Person.class;

		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());

		System.out.println("***********************************************");
		Class<?> classobj = null;
		try {
			classobj = Class.forName("com.tz.test.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person person = null;
		try {
			person = (Person) classobj.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		person.name = "Tom";
		person.age = 18;		
		person.introduce();
		System.out.println("***********************************************");
		
		Class<?> classobj2 = null;
		try {
			classobj2.forName("com.tz.test.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Object obj = null;
		try {
			obj = classobj2.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Class<?> classwhat = obj.getClass();
		//classwhat.getMethod(name, parameterTypes)
		
		//Annotation[] annos =    obj.getAnnotations();
		//annos[1].

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
			String strrr = String.valueOf(a + d + x);
			return strrr;
		});
		liststr.stream().filter(x-> x.length()>3);

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
