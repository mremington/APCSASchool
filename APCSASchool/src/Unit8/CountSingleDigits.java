package Unit8;

import java.util.Arrays;
import java.util.Random;

public class CountSingleDigits {
	
	public static int[] randInts(){
		int[] randNums = new int[10];
		
		
		for(int i = 0; i < randNums.length; i++){
			randNums[i] =  (int) (Math.random() * 10 );
		}
		
		return randNums;
	}
	
	public static int[] getCounts(int[] nums){
		int[] counts = new int[10];
		for(int n = 0; n<10; n++){
			for(int i = 0; i<nums.length; i++){
				if(nums[i] == n)
					counts[n] = counts[n]+1;
			}
		}
		
		return counts;
	}

	public static void main(String[] args) {

		int[] randomNumbers = randInts();
		System.out.println(Arrays.toString(randomNumbers));
		System.out.println("\n");
		System.out.println("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
		System.out.println( Arrays.toString( getCounts(randomNumbers) ) );

	}

}
