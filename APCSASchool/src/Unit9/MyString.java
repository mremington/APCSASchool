package Unit9;

public class MyString {
	
	char[] characters;
	
	public MyString(char[] chars){
		characters = chars;
	}
	
	public char charAt(int index){
		return characters[index];
	}//end charAt
	
	public int length(){
		return characters.length;
	}//end length
	
	
	
	
	public MyString substring(int begin, int end){
		char[] temp = new char[end-begin];
		
		for(int i = begin; i< end; i++){
			temp[i-begin] = characters[i];
		}
		
		MyString newString = new MyString(temp);
		
		return newString;
		
	}//end Substring
	
	
	
	
	public MyString toLowerCase(){
		char[] temp = new char[characters.length];
		
		for(int i = 0; i< temp.length; i++){
			
			if( characters[i]>=65 && characters[i]<=90 ){
				temp[i] = (char) (32+characters[i]);
			}
			else
				temp[i] = characters[i];
			
		}
		
		MyString newString = new MyString(temp);
		
		return newString;
		
	}//endtoLowerCase
	
	public boolean equal(MyString s){
		
		int test = 0;
		for(int i = 0; i< s.getCharacters().length; i++){
			
			if( this.getCharacters()[i]==s.getCharacters()[i] ){
				test++;
			}			
		}
		
		if(test==s.getCharacters().length)
			return true;
			
		return false;		
	}//end equals
	
	public char[] getCharacters(){
		return characters;
	}//end getCharacters
	
	public MyString valueOf(int num){
		
		int len = 0;
		while(num>0){
			len++;
			num = num/10;
		}
		
		char[] temp = new char[len];
		
		for(int i = temp.length-1; i> 0; i--){
				temp[i] = (char) (num%10+48);
				num = num/10;
		}
			
		
		MyString newString = new MyString(temp);
		
		return newString;
		
	}//end valueOf
	
	public String toString(){
		String output = "";
		for(char c:characters){
			output += c;
		}
		return output;
	}
	
	

}
