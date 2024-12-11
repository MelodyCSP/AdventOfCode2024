import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
	
	
	
	
	public static void main(String[] args) {
		
		File day1 = new File("Puzzle1.txt");
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		try {
			
			Scanner scan = new Scanner(day1);
			int sum = 0;
			while(scan.hasNext()) {

				//read in 2 ints per iteration
				int first = scan.nextInt();
				int second = scan.nextInt();
				
				//add the two numbers to their respective lists
				left.add(first); //add the first column num to the left list
				right.add(second);
			}
				//perform a sequential search in the left list to look for the smallest element
				while(right.size() > 0) {
					
					
					
					int smallestL = left.get(0);
					int smallIndexL = 0;
					
					for(int i = 0; i < left.size(); i++) {
						if(left.get(i) < smallestL) {
							//found a smaller num
							smallestL = left.get(i);
							smallIndexL = i;
						}
					}
					
					//remove the smallest value you found
					left.remove(smallIndexL); //next time it is not in the list
					
					
					
					int smallestR = right.get(0);
					int smallIndexR = 0;
					
					for(int i = 0; i < right.size(); i++) {
						if(right.get(i) < smallestR) {
							//found a smaller num
							smallestR = right.get(i);
							smallIndexR = i;
						}
					}
					
					//remove the smallest value you found
					right.remove(smallIndexR); //next time it is not in the list
					
					//find the absolute value difference between the smallest from each list 
					System.out.println("difference is " + Math.abs(smallestR - smallestL));
					
					sum += Math.abs(smallestR - smallestL);
					
				}
				
				System.out.println(sum);
			
			
		
			
		scan.close();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
