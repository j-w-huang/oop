package com.imut.edu.ex12;

import java.io.PipedOutputStream;
import java.io.PrintStream;

public class MyWriter extends Thread {
	private PipedOutputStream outStream; // 将数据输出
	private String messages[] = { "Monday", "Tuesday ", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday" };

	public MyWriter(PipedOutputStream o) {
		outStream = o;
	}

	public void run() {
		PrintStream p = new PrintStream(outStream);
		for (int i = 0; i < messages.length; i++) {
			p.println(messages[i]);
			p.flush();
			System.out.println("Write:" + messages[i]);
		}
		p.close();
		p = null;
	}
}
