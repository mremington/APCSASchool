package ReferenceExample;

import java.util.Scanner;

public class Scores {
	
	private Score[] scores;
	
	public Scores(String scoreList){
		setScores(scoreList);
	}
	
	public void setScores(String scoreList)
	{
		Scanner chop = new Scanner(scoreList);
		scores = new Score[chop.nextInt()];
		chop.next();
		for(int i=0; i<scores.length; i++)
		{
			scores[i]= new Score(chop.nextInt());
		}		
	}
	
	public double getLowScore()
	{
		int low = Integer.MAX_VALUE;
		for(Score s : scores)
		{
			if(low>s.getValue())
			  low=s.getValue();			   
		}
		return low;
	}
	
	public double getHighScore()
	{
		int high = Integer.MIN_VALUE;
		for(Score s : scores)
		{
			if(high<s.getValue())
			  high=s.getValue();			   
		}
		return high;
	}
	
	public String toString()
	{
		String output="";
		for(Score s : scores)
		{
			output+=s.getValue()+" ";
		}
		return output;
	}	

}
