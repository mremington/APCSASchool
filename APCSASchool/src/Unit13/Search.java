package Unit13;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {

		int[] numbers = new int[100];
		for(int i = 0; i < numbers.length; i++){
			int newNum = (int)(Math.random()*100);
			
			while(Arrays.binarySearch(numbers, newNum) > 0)
				newNum = (int)(Math.random()*100);
			
			numbers[i] = newNum;
		}
		
		double time = 0.0;
		
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		time = System.currentTimeMillis();
		for(int c = 0; c<100; c++){
			
			int foundLoc = Arrays.binarySearch(numbers, (int)(Math.random()*100));
			if( foundLoc >0 ){
				System.out.println(System.currentTimeMillis()-time);
				System.out.println(foundLoc);
			}
				
			
		}

	}

}
