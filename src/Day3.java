import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {
	
	
	public static int multiply(String mul) {
		int res = 0;
		
		
		res = Integer.parseInt(mul.substring(4, mul.indexOf(","))) * Integer.parseInt(mul.substring(mul.indexOf(","+1), mul.indexOf(")")));
		return res;
	}
	
	/*
	 * Extract the next multiplication command from the given line
	 * 
	 * returns an empty string if none exist
	 */
	public static String extract(String line) {
		
		if(line.indexOf("mul(") == -1) {
			return ""; // not valid command found in line
		} else {
			int start = line.indexOf("mul(");
			int end = line.indexOf(")");
			
			//STOP! if there is no closing ")" then this is not the one we want :(
			
			
			return line.substring(start, end);
		}
		
	}
	
	
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
					
					
					String line = scan.next();
					
					String regex = "mul\\((\\d+),(\\d+\\)";
					
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher = pattern.matcher(line);
					
					ArrayList<String> list = new ArrayList<String>(); 
					
					while(matcher.find()) {
						list.add(matcher.group());					
					}
					
					System.out.println("Valid 'mul' calls:");
					for(String call : list) {
						System.out.println(call);
					}
					
					
					
					
				
					
				}
			
				scan.close();
				
					
				System.out.println("TOTAL SUM " + sum);
					
					//always close a scanner
					
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
