package edu.cis232.shapes;

public class Square implements Shape{
	
	double length;
	
	public double getArea(){
		double area = 0;
		area = length*length;
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = 0;
		perimeter = 4*length;
		return perimeter;
	}
}