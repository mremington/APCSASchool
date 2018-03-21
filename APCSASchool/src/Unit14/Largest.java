package Unit14;

import java.util.Scanner;

public class Largest {

	public static int getLargest(int[] nums, int loc, int big){
		
		if(loc==nums.length){
			return big;
		}
		else{
			
			if(nums[loc] > big)
				big = nums[loc];
			loc++;
			return getLargest(nums, loc, big);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] numbers = new int[8];
		
		for(int i = 0; i< 8; i++){
			System.out.println("Enter number " + (i+1) + ":");
			numbers[i] = input.nextInt();
		}
		
		System.out.println(getLargest(numbers, 0, 0));

	}

}
