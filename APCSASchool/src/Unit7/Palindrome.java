package Unit7;

public class Palindrome {
	
	public static int reverse(int num){
		int revNum = 0;
		
		while(num > 0){
			
			revNum = revNum * 10 + num % 10;
			
			num/=10;
		}
		
		return revNum;
	}
	
	public static boolean isPalindrome(int num){
		
		return num==reverse(num);
	
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(343));
		System.out.println(isPalindrome(342));

	}

}
