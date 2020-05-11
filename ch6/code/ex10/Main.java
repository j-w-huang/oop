package com.imut.edu.ex10;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		FileInputStream fin = null;
		DataInputStream din = null;

		try {
			
			byte bArray[]=new byte[128];
			String str;
			System.out.println("Enter something Using Keyborad:");
			System.in.read(bArray);
			str = new String(bArray, 0);
			System.out.print("You entered:");
			System.out.println(str);

			
//			fin = new FileInputStream("b.txt");
//			din = new DataInputStream(fin);
//			
//			int lineCnt = 0;
//			int charCnt = 0;
//			String readStr = null;
//			while((readStr=din.readLine())!=null) {
//				lineCnt++;
//				charCnt += readStr.length();
//			}
//			
//			System.out.println(lineCnt);
//			System.out.println(charCnt);
//			
//			System.in.read();
			
			
			
//			fin = new FileInputStream("a.txt");
//			din = new DataInputStream(fin);
//			
//			boolean b = din.readBoolean();
//			byte bt = din.readByte();
//			
//			System.out.println(b);
//			System.out.println(Integer.toHexString(bt));


			// fos = new FileOutputStream("a.txt");
			// dos = new DataOutputStream (fos);
			//
			// dos.writeBoolean(true);
			// dos.writeByte((byte)0x12);
			// dos.writeByte((byte)0x34);
			// dos.writeChar('J');
			// dos.writeDouble(3.141592654);
			// dos.writeFloat(2.7182f);
			// dos.writeInt(1234567890);
			// dos.writeLong(998877665544332211L);
			// dos.writeShort((short)11223);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
//			try {
//				//dos.close();
//				//din.close();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}

	}

}
