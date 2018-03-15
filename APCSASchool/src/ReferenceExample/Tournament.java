package ReferenceExample;


public class Tournament {
	
	private String name;
	private Player[] playerList;
	
	
	public Tournament(String name, int playerCount)
	{
		this.name=name;
		playerList=new Player[playerCount];		
	}
	
	public void addPlayer(int playerNum, Player p)
	{
		playerList[playerNum]=p;
	}
	
	public String toString()
	{
		String output=""+name+"\n";
		for(Player p : playerList)
		{
			output+=p+"\t"+p.getScores().toString()+"\n";
		}
		return output;
	}  	

}
