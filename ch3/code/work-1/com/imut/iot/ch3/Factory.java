package com.imut.iot.ch3;


public class Factory {
	public static Furniture[] createFurnitures(int type,int num) {
		Furniture[] retFurnitures = new Furniture[num];
		for(int i=0;i<num;i++) {
			retFurnitures[i] = createFurniture(type);
		}
		return retFurnitures;
	}
	
	// 0: wood, 1:metal
	public static Furniture createFurniture(int type) {
		Furniture retFurniture;
		
		retFurniture = type==0? new WoodFurniture(type) : new MetalFurniture(type);
		
		return retFurniture;
	}


}


