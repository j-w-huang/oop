package com.imut.iot.ch3;

public class Converter {
	public byte[] toBytes(byte b) {
		byte[] retBytes = new byte[]{b};
		
		return retBytes;
	}
	
	public byte[] toBytes(short s) {
		byte[] retBytes = new byte[2];
		
		for(int i=0;i<2;i++) {
			byte b = (byte)((s>>i*8) & 0xff);
			retBytes[i]=b;
		}
		
		return retBytes;
	}
	
	public byte[] toBytes(int n) {
		byte[] retBytes = new byte[4];
		for(int i=0;i<4;i++) {
			byte b = (byte)((n>>i*8) & 0xff);
			retBytes[i]=b;
		}
		return retBytes;
	}
	
	public byte[] toBytes(long l) {
		byte[] retBytes = new byte[8];
		for(int i=0;i<8;i++) {
			byte b = (byte)((l>>i*8) & 0xff);
			retBytes[i]=b;
		}
		return retBytes;
	}
	
	public byte[] toBytes(float f) {
		int i2f = Float.floatToRawIntBits(f);
		return this.toBytes(i2f);
	}
	
	public byte[] toBytes(double d) {
		long l2f = Double.doubleToRawLongBits(d);
		return this.toBytes(l2f);
	}

}
