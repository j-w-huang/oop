package com.imut.iot.ex8;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {

		try {
			Person p = new Person();
			
			Class classOfP = Person.class;
			
			String strClassOfP = "com.imut.iot.ex8.Person";
			Class clsOfP = Class.forName(strClassOfP);
			
			ClassLoader classLoader = clsOfP.getClassLoader();
			
			Object obj = clsOfP.newInstance();
			
			Constructor[] cons = clsOfP.getDeclaredConstructors();
			for(Constructor c: cons) {
				System.out.println("Constructor Name is " + c.getName() + " ParameterCount is " + c.getParameterCount());
			}
			
			//动态调用
			clsOfP.getMethod("SayHello").invoke(obj,null);
			
			//通过反射方式改变成员变量的值
			Field fieldOfP = clsOfP.getField("name");
		    fieldOfP.set(obj, "Tony");
		

			System.out.println(classOfP.getPackage());
			System.out.println(classOfP.getName());
			
			System.out.println(clsOfP.getName());
		    System.out.println(obj);
		    
		    //由哪个类加载器加载的
		    System.out.println(classLoader);
		    
		    //测试Object由哪个类加载器加载的
		    System.out.println(Class.forName("java.lang.Object").getClassLoader());
		    
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
