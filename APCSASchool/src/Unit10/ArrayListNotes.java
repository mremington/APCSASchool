package Unit10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListNotes {
	
	static int[]  numbers = {2,3,4};
	
	static ArrayList<Object> numList;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numList = new ArrayList();
		
		
		numList.add(2);
		
		
		System.out.println(numList.toString());
		
		System.out.println(numList.get(0));
		
		System.out.println(numbers);
		
		int[] temp = numbers;
		//temp[0]  = 9;
		
		System.out.println(temp);
		System.out.println(Arrays.toString(numbers));
		

	}

}
