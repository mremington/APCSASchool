package ReferenceExample;



public class Player {
	
	private String name;
	private Scores scores;
	
	public Player(String n, String scoreList){
		setName(n);
		setScores(scoreList);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setScores(String scoreList){
		scores = new Scores(scoreList);
	}
	
	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	public String toString()
	{
		return name + " = " + scores.toString();
	}	
	

}
