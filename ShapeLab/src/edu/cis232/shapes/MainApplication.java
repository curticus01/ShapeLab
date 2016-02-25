package edu.cis232.shapes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class MainApplication {

	public static void main(String[] args) throws IOException 
	{
		String name="";
		double p1=0;
		double p2=0;
		
		File file = new File("shapes.csv");
		Scanner input = new Scanner(file);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		while(input.hasNextLine())
		{
			String data = input.nextLine();
			StringTokenizer tokens = new StringTokenizer(data, ",");
			
			if(tokens.countTokens()==3)
			{
				name = tokens.nextToken();
				p1 = Double.parseDouble(tokens.nextToken());
				p2 = Double.parseDouble(tokens.nextToken());
				
			}
			else if(tokens.countTokens()==2)
			{
				name = tokens.nextToken();
				p1 = Double.parseDouble(tokens.nextToken());
			}
			if(name.equalsIgnoreCase("circle"))
			{
				Circle circle = new Circle(p1);
				shapes.add(circle);
				//System.out.printf("This Circle has an Area of %d and a perimeter of %d",circle.getArea(), circle.getPerimeter());				
			}
			
			if(name.equalsIgnoreCase("square"))
			{
				Square square= new Square(p1);
				shapes.add(square);
			}

			if(name.equalsIgnoreCase("rectangle"))
			{
				Rectangle rectangle = new Rectangle(p1,p2);
				shapes.add(rectangle);
			}

			if(name.equalsIgnoreCase("RightTriangle"))
			{
				RightTriangle triangle = new RightTriangle (p1,p2);
				shapes.add(triangle);
			}

		}
		for(Shape shape : shapes)
		{
			System.out.println(shape);			
		}
		input.close();
	}

}
