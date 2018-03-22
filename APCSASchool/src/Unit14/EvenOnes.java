package Unit14;

import java.util.Arrays;

public class EvenOnes {

	public static void main(String[] args) {

		int[][] matrix = new int[6][6];
		int evensRow = 0;
		int evensCol = 0;
		
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[r].length; c++){
				matrix[r][c] = (int)(Math.random() * 2);
			}
		}
		
		for(int r = 0; r < matrix.length; r++){
			System.out.println(Arrays.toString(matrix[r]));
		}
		
		for(int r = 0; r < matrix.length; r++){
			evensRow = 0;
			for(int c = 0; c < matrix[r].length; c++){
				if(matrix[r][c] % 2 ==0){
					evensRow++;
				}
			}
			if(evensRow % 2 ==0)
				System.out.println("Row " + r + " has an even number of ones");
		}
		
		
		for(int r = 0; r < matrix.length; r++){
			evensCol = 0;
			for(int c = 0; c < matrix.length; c++){
				if(matrix[c][r] % 2 ==0)
					evensCol++;
			}
			if(evensCol % 2 ==0){
				System.out.println("Column " + r + " has an even number of ones");
			}
		}
	}

}
