package Unit5;

import java.util.Random;

public class Plates {

	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String nums ="0123456789";
		
		String plateNumber = "";
		Random rand = new Random();
		for(int i = 0; i < 3; i++){
			plateNumber += alpha.charAt( rand.nextInt(25) );
		}
		
		plateNumber = plateNumber.toUpperCase();
		
		for(int i = 0; i < 4; i++){
			plateNumber += nums.charAt( rand.nextInt(10) );
		}
		
		System.out.println(plateNumber);
		
		
		
		String s ="COMPSCI";
				
		
		System.out.println(s.substring(0,3));
	}

}
