package Unit7;

import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number to convert to binary: ");
		int base10 = input.nextInt();
		int temp = base10;
		String binary = "";
		
		//one byte = 8 bits
		//2^7, 2^6, 2^5, 2^4, 2^3, 2^2, 2^1, 2^0
		//128  ,64  ,32  ,16  ,8   ,4  ,2   ,1
		for(int i = 7; i >=0; i--){
			
			if(temp > (int)Math.pow(2, i))
				temp = temp - temp % (int)Math.pow(2, i);
			if(temp / Math.pow(2, i)==1)
				binary += "1";
			else
				binary += "0";
			if(i%4==0)
				binary += " ";
			
			temp = base10 % (int)Math.pow(2, i);
			
		}
		
		System.out.println(binary);
		String binary2 = "";
		for(int i = 0; i < 8; i++){
			if(base10 % 2 == 1){
				binary2 = "1" + binary2;
			}
			if(base10 % 2 == 0){
				binary2 = "0" + binary2;
			}
			
			base10 = base10/2;
		}
		System.out.println(binary2);

	}

}
