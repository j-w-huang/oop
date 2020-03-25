package com.imut.iot;

public class num {
	public static void main(String[] args) {
		byte b = -2;
		short s = 2;
		int i = 300;
		long l = 4;
		float f = 0.1f;
		double d = 0.25;

		Byte B = Byte.valueOf(b);
		int ub = Byte.toUnsignedInt(b);

		Short S = Short.valueOf(s);
		int i98 = Short.parseShort("98");

		Integer I = Integer.valueOf(i);

		Float F = Float.valueOf(f);
		Double D = Double.valueOf(d);

		System.out.println("b unsigned is " + ub);
		System.out.println("i98 unsigned is " + i98);

		System.out.println("i bin is " + Integer.toBinaryString(i));
		System.out.println("i oct is " + Integer.toOctalString(i));
		System.out.println("i hex is " + Integer.toHexString(i));
		// 2-36进制，0-9:10，a-z:26 -->36
		System.out.println("i r is " + Integer.toString(i, 16));

		int f2i = Float.floatToRawIntBits(f);
		
		String d2s = Double.toHexString(d);

		System.out.println("f bin is " + Integer.toBinaryString(f2i));
		System.out.println("d hex is " + d2s);
		

	}

}
