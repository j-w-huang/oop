package com.imut.iot.ex13;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.*;

public class Main {

	public static void main(String[] args) {
//		
//		try {
//			//DNS转换，InetAddress不可以new
//			InetAddress addr = InetAddress.getByName("www.baidu.com");
//			InetAddress addr2 = InetAddress.getLocalHost();
//			
//			URL url1 = new URL("http://www.baidu.com");
//			URL url2 = new URL("http://192.168.31.124:8080/README.md");
//			
//			InputStream iptStream = url2.openStream();
//			InputStreamReader reader = new InputStreamReader(iptStream,"UTF-16LE");
//			BufferedReader in = new BufferedReader(reader);
//			
//			System.out.println(in.readLine());
//		
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			Socket sock = new Socket(local,2020);
			OutputStream opStm = sock.getOutputStream();
			OutputStreamWriter wr = new OutputStreamWriter(opStm);
			
			for(int i=0;i<10;i++)
				wr.write("hello world\r\n");
			wr.flush();
			
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			String strLn = stdIn.readLine();
			
			wr.write(strLn);
			wr.flush();
			
			
			InputStream inStm = sock.getInputStream();
			if(inStm.available()>0) {
				System.out.println(inStm.read());
			}
			
			System.out.println(sock.isConnected());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
