package ReferenceExample;

public class Score {

	private int value;
	
	public Score(int value){
		setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString(){
		return ""+value;
	}

}
