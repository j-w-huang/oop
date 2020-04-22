package com.imut.iot.ex6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// 接口、抽象类不可以直接new
		// Collection<Integer> c = new Collection<Integer>();

		// 可以用子类实例化
		Collection<Integer> c = new Vector<Integer>();
		c.add(1);
		c.add(2);
		c.add(1);
		c.add(2);
		c.add(1);
		c.add(2);

		// 虽然参数是接口型，一般给过来的是子类实现的对象
		ArrayList<Integer> arrLst = new ArrayList<Integer>(c);

		// Lamda表达式
		arrLst.forEach(e -> System.out.println(e));

		LinkedList<Integer> lnkLst = new LinkedList<Integer>(c);
		lnkLst.forEach(e -> System.out.println(e));

		// hashCode 是散列值
		Object obj = new Object();
		System.out.println(obj.hashCode());

		System.out.println("=========================");
		//

		Set<String> set = new HashSet<String>();

		set.add("hh");
		set.add("hh");
		set.add("hh");
		set.add("oo");
		set.add("oo");
		set.add(null);
		set.add(null);
		set.forEach(e -> System.out.println(e));

		System.out.println("=========================");
		TreeSet<Integer> treeSet = new TreeSet<Integer>(c);
		treeSet.forEach(e -> System.out.println(e));

		System.out.println("=========================");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("One", 3);

		map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
		map.keySet().forEach(k -> System.out.println("key: " + k + " value: " + map.get(k)));

		// 匿名类
		map.values().forEach(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				System.out.println("value is " + t);
			}
		});

		// 
		map.forEach(new BiConsumer<String, Object>() {
			@Override
			public void accept(String t, Object u) {
                 System.out.println("key: " + t + " value: " + u);
			}
		});

	}

}
