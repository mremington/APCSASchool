package Unit10;

public class MyIntegerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger myint = new MyInteger(250);
		
		char[] nums = {'2','5','2'};
		System.out.println(myint.parseInt(nums));
		System.out.println(myint.parseInt("32345"));

	}

}
