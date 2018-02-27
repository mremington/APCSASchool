package Unit5;

import java.util.Scanner;

public class SSN {

	public static void main(String[] args) {
		String validSSN = "a23-45-6789";
		
		if(validSSN.charAt(0) >= 48 && validSSN.charAt(0) <= 57)
			System.out.println("is digit!");
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a valid SSN: ");
		String ssn = input.nextLine();
		
		
		for(int c = 0; c < ssn.length(); c++){
			System.out.println(ssn.charAt(c));
		}
		
		int c = 0;
		while( c < ssn.length()){
			System.out.println(ssn.charAt(c));
			c++;
		}
		
		for(char ch : ssn.toCharArray()){
			System.out.println(ch);
		}
		


	}

}
