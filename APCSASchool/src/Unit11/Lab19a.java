package Unit11;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Lab19a {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(in);

		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for (int i = 0; i < size; i++) {
			out.print("\nEnter the ht :: ");
			int ht = keyboard.nextInt();
			out.print("Enter the wt :: ");
			int wt = keyboard.nextInt();
			out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			herd.add(i, new Monster(ht, wt, age));
			out.print("\n");
		}
		System.out.println("HERD :: " + herd);
		System.out.println("SMALLEST :: " + herd.getSmallest());
		System.out.println("LARGEST :: " + herd.getLargest());
		System.out.println("HERD :: " + herd);

	}
}