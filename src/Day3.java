import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {
	
	
	public static int multiply(String mul) {
		 if (mul.startsWith("mul(") && mul.endsWith(")")) {
			String[] parts = mul.substring(4, mul.length()-1).split(",");
			
			try {
				int x = Integer.parseInt(parts[0]);
				int y = Integer.parseInt(parts[1]);
			
			
				return x * y;
			} catch(NumberFormatException e) {
				System.out.println("failed");
			}
		 }
		 
		 return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		
			File file = new File("day3.txt");
		

				
			//Use scanner class to read file
			try {
					
					
				Scanner scan = new Scanner(file);
				int sum = 0;
				boolean isDo = true;
				
				while(scan.hasNextLine())
				{	
					
					
					String line = scan.nextLine();
					
					String regex = "mul\\((\\d{1,3}),\\s*(\\d{1,3}\\))";
					String doRegex = "do\\(\\)";
					String dontRegex = "don't\\(\\)";
					
					
					
			
					
					Pattern pattern = Pattern.compile((regex + "|" + doRegex + "|" + dontRegex));
					Matcher matcher = pattern.matcher(line);
				
					
					ArrayList<String> list = new ArrayList<String>(); 
					
				
					
					while(matcher.find()) {
						
						String matchText = matcher.group();					
						
						
							
							if(matchText.matches(regex) && isDo == true) {
								
								list.add(matchText);
								
							} else if(matchText.matches(doRegex)) {
								isDo = true;
							} else if(matchText.matches(dontRegex)) {
								isDo = false;		
							}
						
					}
					
					
					for(String call : list) {
						
						System.out.println(call);
						sum += multiply(call);
						
					}
					
				
					
					
					System.out.println("TOTAL SUM " + sum);

					
					
				}
			
				scan.close();
					
				
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
