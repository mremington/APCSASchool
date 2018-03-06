package Unit10;

public class MyInteger {
	
	int value;
	
	public MyInteger(int n){
		value = n;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEven(){
		return value%2==0;
	}
	
	public boolean isOdd(){
		return value%2!=0;
	}
	
	public  boolean isPrime() { 
		int sqrt = (int) Math.sqrt(value) + 1; 
		for (int i = 2; i < sqrt; i++) { 
			if (value % i == 0) { 
				// number is perfectly divisible - no prime 
				return false; 
			}	
		}
		return true; 
	}
	
	public static boolean isEven(MyInteger n){
		return n.isEven();
	}
	
	public static boolean isOdd(MyInteger n){
		return n.isOdd();
	}
	
	public static boolean isPrime(MyInteger number) { 

		return number.isPrime(); 
	}
	
	public boolean equals(int n){
		return value==n;
	}
	
	public boolean equals(MyInteger n){
		return this.equals(n);
	}
	
	public static int parseInt(char[] num){
		int number = 0;
		int exp = 0;
		for(int i = num.length-1; i>= 0; i--){
			number += Math.pow(10, exp) * (num[i]-48);
			exp++;
		}
		
		return number;
	}
	
	public static int parseInt(String s){
		char[] nums = s.toCharArray();
		return parseInt(nums);
	}
	

		
	
	

}
