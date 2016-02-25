package edu.cis232.shapes;

public class Square implements Shape{
	
	double length;
	
	public double getArea(){
		double area = 0;
		area = length*length;
		return area;
	}
	
	public double getPerimeter(){
		double parimeter = 0;
		parimeter = 4*length;
		return parimeter;
	}
}
