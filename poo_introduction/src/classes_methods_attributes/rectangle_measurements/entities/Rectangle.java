package classes_methods_attributes.rectangle_measurements.entities;

public class Rectangle {
	
	public double wight;
	public double height;
	
	
	public double areaRectangle() {
		return wight * height;
	}
	
	public double perimeterRectangle() {
		return 2 *(wight + height);
	}
	
	public double diagonalRectangle() {
		return Math.sqrt(Math.pow(wight, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "Area: "+String.format("%.2f", areaRectangle())+
				"\nPerimetro: "+String.format("%.2f", perimeterRectangle())+
				"\nDiagonal: "+String.format("%.2f", diagonalRectangle());
	}

}
