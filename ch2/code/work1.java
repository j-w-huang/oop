package com.imut.iot;

public class work1 {
	public static byte[] floatToBytes(float f) {
		byte[] retBytes = new byte[4];
		
		int f2i = Float.floatToRawIntBits(f);
		
		System.out.println((int)Integer.toUnsignedLong(f2i));
		
		for(int i=0;i<4;i++) {
			byte b = (byte)((f2i>>8*i) & 0xff);
			retBytes[i] = b;
		}
		//work1.main(args);
		
		return retBytes;
	}
	/**
	 * 
	 * @param bytes
	 * @param edian 0:lsb, 1:msb
	 * @return
	 */
	public static float bytesToFloat(byte[] bytes , int edian) {
		float retFloat = Float.NaN;
		//宋阳同学下次课讲....
		int b0 = bytes[0] & 0xff;
		int b1 = bytes[1] & 0xff;
		int b2 = bytes[2] & 0xff;
		int b3 = bytes[3] & 0xff;
		
		int i2f = edian==0 ?
				  b0 | b1<<8 | b2<<16 | b3<<24 :
				  b3 | b2<<8 | b1<<16 | b0<<24;	  
		
		retFloat = Float.intBitsToFloat(i2f);
		//
		return retFloat;
	}
	
	public static void main(String[] args) {
		int a = 100;
		byte[] lsb = new byte[4];
		byte[] msb = new byte[4];
		
		float f = 0.1f;
		byte[] retBytes=floatToBytes(f);
		float retFloat = bytesToFloat(retBytes,0);
		
		for(int i=0;i<4;i++) {
			byte b = (byte)((a >> (8*i)) & 0xff);
			lsb[i] = b; 
			msb[4-i-1] = b;
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(i+"--> msb " + Integer.toHexString(msb[i]));
		}
	}

}
