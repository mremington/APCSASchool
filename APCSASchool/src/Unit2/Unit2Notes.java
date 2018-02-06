package Unit2;

public class Unit2Notes {
	
	static float fNum = 4.5556677f;
	static String  output = "";
	static int number = 0;
	
	public static void main(String[] args){
		output += "Formatted Number: ";
		output += String.format("%.2f", fNum);
		fNum = 6.785756f;
		output += "\nFormatted Number: ";
		output += String.format("%.2f", fNum);
		System.out.println(output);
		
		number = (int) fNum;
		System.out.println(number);
	}

}
