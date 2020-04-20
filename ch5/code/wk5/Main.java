/*
 * 分析“你好”，各类编码输出各类编码字节数组
 * 
 * 有一个人，能走路，这个可以遗产给他儿子，他有糖尿病，不会遗传给儿子。。找个人做。。
 */
package com.imut.iot.wk5;

import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) {
		TransEncoder transEncoder = new TransEncoder();
		transEncoder.setTransString("你好");
		
		byte[] bytes1 = transEncoder.getEncodeBytes(Charset.forName("GB2312"));
		byte[] bytes2 = transEncoder.getEncodeBytes(Charset.forName("GBK"));
		byte[] bytes3 = transEncoder.getEncodeBytes(Charset.forName("US-ASCII"));
		byte[] bytes4 = transEncoder.getEncodeBytes(Charset.forName("UTF-8"));
		byte[] bytes5 = transEncoder.getEncodeBytes(Charset.forName("UTF-16LE"));
		byte[] bytes6 = transEncoder.getEncodeBytes(Charset.forName("UTF-16BE"));
		byte[] bytes7 = transEncoder.getEncodeBytes(Charset.forName("UTF-16"));
		
		//程序运行的当前时间毫秒 10-3
		long startMillTime = System.currentTimeMillis();
		
		//程序运行的当前时间纳秒 10-9
		long startNanoTime = System.nanoTime();
		
		System.out.println(startMillTime);
		System.out.println(startNanoTime);
		
		String str = "";
		StringBuilder sBld = new StringBuilder(); 
		StringBuffer sBuf = new StringBuffer();
		
		for(int i=0;i<1000000;i++) {
			sBuf.append(i);
		}
		
		long endMillTime = System.currentTimeMillis();
		long endNanoTime = System.nanoTime();
		
		System.out.println(endMillTime-startMillTime);
		System.out.println(endNanoTime-startNanoTime);
		
		// 如果是用 + 拼接，那么时间很长。。。。
		// 如果是用 StringBuilder 235ms
	}

}

class TransEncoder {
	private String transString = null;
	
	// 对内部成员变量的写操作
	public void setTransString(String str) {
		this.transString = str;
	}
	
	// 对内部成员变量的读操作
	public String getTransString() {
		return this.transString;
	}
	
	public byte[] getEncodeBytes(Charset charset) {
		byte[] retBytes = null;
		
		if(this.transString==null) {
			retBytes = null;
		} else {
			retBytes = this.transString.getBytes(charset);
		}
		
		return retBytes;
	}
}

