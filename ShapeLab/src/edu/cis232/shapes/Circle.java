package edu.cis232.shapes;

public class Circle implements Shape{
	
	double radius;
	
	public Circle(double radius){
		this.radius = radius;
		
	}
	
	public double getArea(){
		double area = 0;
		area = Math.PI*(radius*radius);
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = 0;
		perimeter = 2*(Math.PI*radius);
		return perimeter;
	}
}
