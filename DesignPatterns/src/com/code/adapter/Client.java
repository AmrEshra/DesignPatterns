package com.code.adapter;

public class Client {

	public static void main(String [] args){

        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);

        calculateRectangleSize(adapter);
	}
	
	public static void calculateRectangleSize(Rectangle rectangle){
		System.out.println("Rectangle Size: "+rectangle.determineSize());
	}
}

