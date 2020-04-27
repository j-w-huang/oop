package com.imut.iot.ex7;

public class Main {
    public static void divByZero() throws ArithmeticException {
    	    try {
			int i = 0;
			// 编译能过，说明不是错误，但是会产生异常
			int j = 1 / i;
			
		} catch(ArithmeticException e) {
			throw e;
		}
    }
    
    /**
     * 计算两个数之和，当任意一个数超出范围(本例为10～20)时，抛出自己的异常。
     * @param a,b
     * @throws NumberRangeException
     */
    public static int testNumberRangeExpception(int a, int b) 
    		throws NumberRangeException {
    		if(a>20 || a<10) {
    			throw new NumberRangeException("arg: a is not in 10~20");
    		}
    		
    		if(b>20 || b<10) {
    			throw new NumberRangeException("arg: b is not in 10~20");
    		}
    		
    		return a+b;
    }
    
    public static int callTest(int a, int b)  
    		throws NumberRangeException {
    	
    	    //通过异常传播过来的
    		return testNumberRangeExpception( a, b);
    }
    
	public static void main(String[] args) {
		
		try {
			//divByZero();
			//testNumberRangeExpception(9,12);
			callTest(9,12);
		} catch (NumberRangeException e) {
			//终止执行，线程的话，线程会挂掉
			e.printStackTrace();
		} catch (ArithmeticException e) {
		e.printStackTrace();
		}
	}
}
