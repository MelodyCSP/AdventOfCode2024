import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day2 {

	public static boolean decr(String[] list) {
		
		
		for(int i = 1; i < list.length; i++) {

			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			
			if(el0 <= el1) {
				return false;
			} else if (el1 - el0 > 3 ) {// if the diff is greater than 2
				return false;
			}
		}
		
		
		return true;
		
	}
	
	public static boolean incr(String[] list) {
		
		
		for(int i = 1; i < list.length; i++) {

			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			
			if(el1 <= el0) {
				return false;
			} else if (el0 - el1 > 3) {// if the diff is greater than 2
				return false;
			}
			
			
		
		}
		
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
			File file = new File("day2.txt");
			int count = 0;
				
			//Use scanner class to read file
			try {
					
					
				Scanner scan = new Scanner(file);

				
				
					
				
				
				//put the reports in an arraylist and sort them
				while(scan.hasNext()) {
					
				
					String line = scan.nextLine()
;
					//split the line into a string array
					String[] elements = line.split(" ");
					
				
					if(incr(elements) || decr(elements)) {
						count++;
					} else {
						System.out.println(Arrays.toString(elements));

					}
					
				}
				
				
				
			
				
				
					
				System.out.println("TOTAL SAFE " + count);
					
					//always close a scanner
					
					scan.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
