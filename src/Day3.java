import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
	
	
	
	
	public static void main(String[] args) {
		
			File file = new File("day3.txt");
			int sum = 0;
			
			//make an ArrayList to hold all viable memories
			ArrayList<Integer> nums = new ArrayList<Integer>(); 
				
			//Use scanner class to read file
			try {
					
					
				Scanner scan = new Scanner(file);

				
				while(scan.hasNext())
				{	
					String line = scan.nextLine();
					//split all of the calls of the mul(X,Y) by ")"
					String[] elements = line.split(")");
					
					
				}
			
				
				
					
				System.out.println("TOTAL SUM " + sum);
					
					//always close a scanner
					
					scan.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
