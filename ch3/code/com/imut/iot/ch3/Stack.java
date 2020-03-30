package com.imut.iot.ch3;

public class Stack {
	private int[] intArr;
	private int p;
	private int Size;
	
	public Stack(int Size) {
		intArr = new int[Size];
		this.Size = Size;
        this.p = -1;
	}
	
	/**
	 * 入栈 
	 */
	public void push(int i) {
		if(this.isFully()) {
			System.out.println("the stack is full!");
			return;
		}
		
		p++;
		intArr[p] = i;
		
		System.out.println(i);
	}
	
	/**
	 * 出栈 
	 */
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("the stack is Empty!");
			return -1;
		}
		
		
		return intArr[p--];
	}
	
	/**
	 * 判断栈空 
	 */
	public boolean isEmpty() {
		return p==-1;
	}
	
	/**
	 * 判断栈满 
	 */
	public boolean isFully() {
		return this.p==this.Size-1;
	}

}
