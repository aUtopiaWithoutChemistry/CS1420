package assign02;

import java.util.Scanner;

/**
*  CS 1420 Assignment 2
*  @author Zifan Zuo
*  @version Aug 29, 2024
*/

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			// ask user type name and store input.
			System.out.println("Please enter your name: ");
			String name = input.nextLine();
			
			// check if the command satisfy the exit condition
			if(name.equals("exit")) {
				System.out.println("Goodbye");
				break;
			}
			
			// create fortune 
			int luckyNumber = 0;
			for(int i = 0; i < name.length(); i++) {
				luckyNumber += (int)name.charAt(i);
			}
			
			// generate happiness, career, and love number
			int happiness, career, love;
			happiness = (luckyNumber % 89) / 15;
			career = (luckyNumber % 64) / 11;
			love = (luckyNumber % 42) / 7;
			
			// calculate fortune
			String fortune;
			if ((happiness + career + love) > 7)
				fortune = "good";
			else
				fortune = "bad";
			
			// print out the final results
			System.out.println("Your fortune is " + fortune + "\n"
					+ "Happiness: " + happiness + "\n"
					+ "Career: " + career + "\n"
					+ "Love: " + love + "\n"
					+ "Lucky number: " + luckyNumber);
		}
			
		input.close();
	}

}
