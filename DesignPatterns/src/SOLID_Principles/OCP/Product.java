package SOLID_Principles.OCP;

import SOLID_Principles.OCP.enums.Color;
import SOLID_Principles.OCP.enums.Size;

public class Product {
	public String name;
	public Color color;
	public Size size;
	
	public Product(String name, Color color, Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
}