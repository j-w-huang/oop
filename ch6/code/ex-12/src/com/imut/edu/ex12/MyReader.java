package com.imut.edu.ex12;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;

public class MyReader extends Thread {
	private PipedInputStream inStream; // 从中读数据

	public MyReader(PipedInputStream i) {
		inStream = i;
	}

	public void run() {
		String line;
		DataInputStream d;
		boolean reading = true;
		d = new DataInputStream(inStream);
		while (reading && d != null) {
			try {
				line = d.readLine();
				if (line != null)
					System.out.println("Read: " + line);
				else
					reading = false;
			} catch (IOException e) {
			}
		}
		try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
		}
	}
}
