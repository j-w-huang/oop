package com.imut.iot.ch4;

import java.lang.IndexOutOfBoundsException;

public class ArrUtil {
	
	public static void Arr2Copy(int[][] srcArr, 
			                    int x0Src, int y0Src, 
			                    int x1Src, int y1Src, 
			                    int[][] dstArr,
			                    int x0Dst, int y0Dst) throws IndexOutOfBoundsException {
		try {
			for(int j=y0Src;j <= y1Src;j++) {
				for(int i=x0Src; i <= x1Src; i++) {
					dstArr[y0Dst+j-y0Src][x0Dst+i-x0Src] = srcArr[j][i];
				}
			}
		}catch(IndexOutOfBoundsException e) {
			throw e;
		}
	}
}
