package com.imut.iot.ch4;
/*
 * 1.定义两个二维数组，实现二维数组之间的copy, 
 *   可以指定源数据二维区域的左上角坐标和右下角坐标，
 *   到目的数据数组的拷贝，放到给定左上角坐标和右下角坐标区域内。
 *   
 * 2.利用Vector模拟一下Queue，写出入队、出队、队空、队满操作;
 */
public class Main {
	public static void main(String[] args) {
//		int[][] srcArr = new int[20][20];
//		int[][] dstArr = new int[30][30];
//		
//		for(int j=0;j<20;j++) {
//			for(int i=0;i<20;i++) {
//				srcArr[j][i] = j*20 + i;
//			}
//		} 
//		
//		try {
//			ArrUtil.Arr2Copy(srcArr, 0, 0, 10, 10, dstArr, 25, 25);
//		}catch(Exception e) {
//			System.out.println(e.getStackTrace());
//		}
		
		Queue queue = new Queue(9);
		for(int i=0;i<10;i++)
			queue.Push(i);
		
		for(int i=0;i<10;i++) {
			System.out.println(queue.elementAt(i));
		}
		
		System.out.println("len is " + queue.Length());		
		
		for(int i=0;i<10;i++) {
			System.out.println(queue.Pop());
		}
		
		System.out.println("len is " + queue.Length());
		
	}
}
