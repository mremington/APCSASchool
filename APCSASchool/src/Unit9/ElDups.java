package Unit9;

import java.util.Arrays;
import java.util.Scanner;

public class ElDups {

	
	public static int[] eliminateDuplicates(int[] list){
			
	    String nums = list[0]+" ";

		for(int i = 1; i<list.length;i++){
			
				if(nums.indexOf(list[i] + " ")<0){
					nums+=list[i]+" ";
				}
			
		}
		System.out.println(nums);
		String[] numbers = nums.split(" ");
		int[] noDups = new int[numbers.length];
		
		for(int i = 0;i<noDups.length;i++){
			
				noDups[i] = Integer.parseInt(numbers[i]);
		}
		
		return noDups;
	}
	
	public static int[] middleWay(int[] a, int[] b) {
		  int len = 0;
		  if(a.length%2==0)
		    len = 4;
		  else
		    len = 2;
		  int[] middles = new int[len];
		  
		  if(a.length%2==0){
		    middles[0] = a[a.length/2-1];
		    middles[1] = a[a.length/2];
		    middles[2] = b[b.length/2-1];
		    middles[3] = b[b.length/2];
		  }
		  else{
		    middles[0] = a[a.length/2];
		    middles[1] = b[b.length/2];
		  }
		    
		  return middles;
		  
		  
		  
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers will you need?: ");
		int count = input.nextInt();
		input.nextLine();
		System.out.println("Enter your numbers separated by spaces:");
		String numbers = input.nextLine();
		
		int[] numList = new int[count];
		Scanner chopper = new Scanner(numbers);
		for(int i = 0; i< numList.length; i++){
			numList[i] = chopper.nextInt();
		}
		
		System.out.println(Arrays.toString(numList));
		
		System.out.println(Arrays.toString(eliminateDuplicates(numList)));
		
		System.out.println(Arrays.toString(middleWay(numList, eliminateDuplicates(numList))));
		

	}

}
