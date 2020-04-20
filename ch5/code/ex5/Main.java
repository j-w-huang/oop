package com.imut.iot.ex5;

class Generic<T> {
	private T value;
	
	public void setValue(T v) {
		
		//new T();//这样不可以
		
		this.value = v;
	}
	
	public T getValue() {
		return this.value;
	}
}

class AnyThing {
	public static <T> T transAnyThing(T value) {
		return value;
	}
}

public class Main {

	public static void main(String[] args) {
		Generic<String> generic1 = new Generic<String>();
		generic1.setValue("Hello");
		
		//简单的值类型，不可以用做泛型参数，因为它的值是不能赋值成null
		Generic<Integer> generic2 = new Generic<Integer>();
		generic2.setValue(2);
		
		System.out.println(AnyThing.transAnyThing(222));
		
		System.out.println(generic1.getValue());
		System.out.println(generic2.getValue());
	}

}
