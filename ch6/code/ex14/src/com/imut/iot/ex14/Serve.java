package com.imut.iot.ex14;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {
	private ServerSocket sev;
	private int port;
	private int num;

	public Serve(int port) {
		this.port = port;
	}

	public boolean Listen() {
		if (this.port <= 0) {
			return false;
		}

		try {
			this.sev = new ServerSocket(this.port);
			while (true) {
				Socket sock = this.sev.accept();
				this.num++;
				System.out.println("Accetp sock client:" + this.num);
				SockHandlerThread sockHandler = new SockHandlerThread(sock, num);
				sockHandler.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	class SockHandlerThread extends Thread {
		private Socket sock;
		private int num;

		public SockHandlerThread(Socket sock, int num) {
			this.sock = sock;
			this.num = num;
		}

		@Override
		public void run() {
			System.out.println("Sock client " + this.num + " running!");
			PrintWriter sockOu = null;
			BufferedReader keyIn = null;
			BufferedReader sockIn = null;

			try {

				//网络数据输出流转换成打印字符流
				sockOu = new PrintWriter(this.sock.getOutputStream(), true);
				//键盘的输入转换成字符流，加了一个缓冲流
				keyIn = new BufferedReader(new InputStreamReader(System.in));
				//网络数据输入流转换成字符流，加了一个缓冲流
				sockIn = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));

				while (true) {

					if (this.sock.getInputStream().available() > 0) {
						String sockLn = sockIn.readLine();
						System.out.println(sockLn);
					} else if (System.in.available() > 0) {
						String keyLn = String.format("%s\n", keyIn.readLine());
						if (keyLn.length() > 0) {
							sockOu.write(keyLn);
							sockOu.flush();
						}
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					sockOu.close();
					sockIn.close();
					sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
