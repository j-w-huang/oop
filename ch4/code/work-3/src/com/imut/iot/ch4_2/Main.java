package com.imut.iot.ch4_2;
import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args) {
		// 类似printf
		String fmt = String.format("%d is num", 10);
		Object obj = null;
		
		Person person = new Person("frank");
		
		System.out.println(person);
		System.out.println(obj);
		System.out.println(fmt);
		
		// 不推荐这样写法，for循环中大量字符串拼接。。。
		// 包括其他语言，也一样。。。
		// Java语言还算好，编译器帮助优化了，但是其他语言不一定。。
        String a = "";
        for(int i = 0; i < 3; i ++) {
            a += "1";
        }
        
        // StringBuilder & StringBuffer都是AbstractStringBuilder子类
        // AbstractStringBuilder实现了Appendable接口
        
        StringBuilder sBld = new StringBuilder();
        StringBuffer sBuf = new StringBuffer();
        
        sBld.setLength(32);
        
        //容量会很大，保障能容下内容
        System.out.println(sBld.capacity());
        
        //内容的长度，length <= capacity ,Vector也是
        System.out.println(sBld.length());
        
        System.out.println(sBld.toString());
        
        sBld.append("11111111111111111111111111111111111111111");
        //容量会很大，保障能容下内容
        System.out.println(sBld.capacity());
        
        //内容的长度，length <= capacity ,Vector也是
        System.out.println(sBld.length());
        
        Object o = new Object();
        sBld.append(2);
        sBld.append(o);
        
        //链式表达
        sBld.append(2).append(o).append(3).append(person);
        
        System.out.println(sBld);
        
        sBuf.append(a);
        for(int i = 0; i < 3; i ++) {
        	    sBuf.append(i);
        }
        
        // 最终获取拼接的字符
        String finalStr = sBuf.toString();
        System.out.println(finalStr);
        //sBuf.insert(0, a);
        
	}
}
