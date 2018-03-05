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
	
	public static boolean isEven(int n){
		return n%2==0;
	}
	
	public static boolean isOdd(int n){
		return n%2!=0;
	}
	
	public static boolean isPrime(int number) { 
		int sqrt = (int) Math.sqrt(number) + 1; 
		for (int i = 2; i < sqrt; i++) { 
			if (number % i == 0) { 
				// number is perfectly divisible - no prime 
				return false; 
			}	
		}
		return true; 
	}
	
	public boolean equals(int n){
		return value==n;
	}
	
	public boolean equals(MyInteger n){
		return this.equals(n);
	}
	
	public static int parseInt(char[] num){
		int number = 0;
		
		return number;
	}
	
	

		
	
	

}
