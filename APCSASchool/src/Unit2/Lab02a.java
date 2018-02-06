package Unit2;

public class Lab02a
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(2,6);
		test.calculatePerimeter( );
		test.print();

		test.setLengthWidth(12,5);
		test.calculatePerimeter( );
		test.print();
		
		//add more test cases		
		test.setLengthWidth(131,75);
		test.calculatePerimeter( );
		test.print();
		System.out.println("Hello");
	}
}