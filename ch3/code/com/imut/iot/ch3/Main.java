/*
1.编写一个Stack类完成int型变量的入栈、出栈操作，并能判断栈空、栈满操作。
2.利用函数重载，写一个converter类实现能把byte /short/int/long/float/double
  类型转换成byte[]数组。
3.思考：如何保障一个Class在内存中有且仅有一个实例对象 ？(单例模式)
4.一个工厂（Factory），能生产金属的家具(MetalFurniture)和木头家具(WoodFurniture)，
  写一个程序根据客户(Customer) 请求（Request）的参数（材质、个数）生产家具，
  试着用代码模拟（工厂模式）。
*/
package com.imut.iot.ch3;

public class Main {
	public static void main(String[] args) {
//		Stack stack = new Stack(8);
//		for(int i=0;i<10;i++)
//			stack.push(i);
//		for(int i=0;i<10;i++)
//			System.out.println(stack.pop());
//		Converter converter = new Converter();
//		converter.toBytes((byte)10);
//		converter.toBytes((short)0x1234);
//		converter.toBytes((int)10);
//		converter.toBytes((long)10);
		
//		Single single1 = Single.getInstance();
//		Single single2 = Single.getInstance();
//		
//		System.out.println(single1.getName()); 
//		single2.SetName("single2");
//		System.out.println(single1.getName()); 
//		System.out.println(single2.getName()); 
		
//	    Customer customer = new Customer();
//	    Furniture[] furnitures=customer.requset(0, 10);
//	    for(int i=0;i<furnitures.length;i++) {
//	    		System.out.println(furnitures[i].getType());
//	    }	
		
		Furniture f = Factory.createFurniture(1);
		System.out.println(f.getType());
	}
}
