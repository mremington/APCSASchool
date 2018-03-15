package ReferenceExample;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;


public class Scoreboard {

	public static void main(String[] args) throws Exception {
		
		out.println("Welcome to the Golf Score Program");
		
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\ReferenceExample\\scorecards.txt"));
		String tournament = file.nextLine();
		int numPlayers = file.nextInt();
		file.nextLine();
		
		Tournament event = new Tournament(tournament, numPlayers);
		
		for(int i=0; i<numPlayers; i++)
		{
			String name = file.nextLine();
			String scoreList = file.nextLine();			
			event.addPlayer(i,new Player(name, scoreList));
		}
		
		out.println("\n\n"+event);



	}

}
