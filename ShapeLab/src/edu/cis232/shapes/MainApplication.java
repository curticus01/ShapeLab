package edu.cis232.shapes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		File file = new File("shapes.csv");
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()==true){
			String data = input.nextLine();
			StringTokenizer token = new StringTokenizer(input.nextLine().trim());
			
		}
		

	}

}
