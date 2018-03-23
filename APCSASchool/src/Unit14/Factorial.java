package Unit14;

public class Factorial {

	public static long getFactorial(long f, int n, int count){
		System.out.println("Print before the recursive call - factorial value " + f + "stack "+ count);
		if(n == 1){
			return f;
		}
		else{
			f *= n-1;
			count++;
			return getFactorial(f, n-1,count);
		}

	}
	
	public static void getFactorial2(long f, int n, int count){
		
		if(n > 1 ){
			f *= n-1;
			getFactorial2(f, n-1,count+1);
		}
		System.out.println("Print after the recursive call - factorial value " + f + " stack "+ count);

	}
	

	public static void main(String[] args) {
		
		int num = 10;
		long fact = num;
		while(num > 1){
			fact *= num-1;
			num--;
		}
		
		System.out.println(fact);
		//getFactorial(10,10);
		
		System.out.println(getFactorial(10,10,1));
		getFactorial2(10,10,1);

	}

}
