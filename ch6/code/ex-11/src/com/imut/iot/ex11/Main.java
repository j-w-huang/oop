package com.imut.iot.ex11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) {
//		FileOutputStream fo = null;
//		ObjectOutputStream so = null;
//		
//		try {
//			Student stu = new Student();
//			fo = new FileOutputStream("stu.ser");
//			so = new ObjectOutputStream(fo);
//			so.writeObject(stu);
//		} catch(Exception ex) {
//			ex.printStackTrace();
//		} finally {
//			try {
//				so.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
//		FileInputStream fi = null;
//		ObjectInputStream si = null;
//		Student stu = null;
//		
//		try {
//			fi = new FileInputStream("stu.ser");
//			si = new ObjectInputStream(fi);
//			
//			stu = (Student)si.readObject();
//			if(stu!=null) {
//				System.out.println(stu.getName());
//			}
//			
//		} catch(Exception e) {
//			
//		} finally {
//			try {
//				si.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
//		PipedInputStream pis = null;
//		PipedOutputStream pos = null;
//		byte a = 0x12;
//		byte b = 0x34;
//		
//		try {
//			pis = new PipedInputStream();
//			pos = new PipedOutputStream();
//			
//			pos.connect(pis);
//			
//			pos.write(a);
//			pos.write(b);
//			
//			System.out.println(pis.read());
//			System.out.println(pis.read());
//			
//			pis.close();
//			pos.close();
//			
//		} catch(Exception ex) {
//			
//		} finally {
//		}
		
		//字符处理的
		InputStreamReader iptStream = null;
		try {
			iptStream = new InputStreamReader(System.in,"utf-8");
			BufferedReader bufReader = new BufferedReader(iptStream);
			
			String s = null;
			System.out.println("please input:");
			while((s=bufReader.readLine())!=null) {
				System.out.println(s+" len is: " +s.length());
			}
			
		} catch(Exception ex) {
			
		} finally {
			try {
				iptStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}

class Student implements Serializable {
	private String name;
	private transient int age;
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
		this.name = "frank";
	}
	
}
