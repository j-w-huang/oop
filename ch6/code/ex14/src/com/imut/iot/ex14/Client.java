package com.imut.iot.ex14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	private Socket sock = null;
	private String host;
	private int port;

	public Client(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public void Connect() {
		try {
			this.sock = new Socket(this.host, this.port);
			BufferedReader keyIn = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));
			PrintWriter sockOu = new PrintWriter(this.sock.getOutputStream(), true);
			
			while(true) {
				if (this.sock.getInputStream().available() > 0) {
					String sockLn = sockIn.readLine();
					System.out.println(sockLn);
				} else if (System.in.available() > 0) {
					String keyLn = String.format("%s\n", keyIn.readLine());
					if (keyLn.length() > 0) {
						sockOu.write(keyLn );
						sockOu.flush();
					}
				}
			}
//			sockOu.close();
//			sockIn.close();
//			sock.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
