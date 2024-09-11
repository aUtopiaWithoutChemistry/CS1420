package assign03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * CS 1420 Assignment 03
 * 
 * @author Zifan Zuo
 * @version Sep 9, 2024
 */

public class GradeCalculator {

	public static void main(String[] args) {
		// to get a valid input file
		Scanner file;
		do {
			System.out.println("Please type the file name: ");
			Scanner input = new Scanner(System.in);

			try {
				File filename = new File(input.nextLine());
				file = new Scanner(filename);
				input.close();
				break;
			} catch (FileNotFoundException e) {
				System.out.println("File not found, please check your typing.");
			}
		} while (true);

		// read first three line as average exam, lab, and quiz score
		double examScore, labScore, quizScore;
		examScore = file.nextFloat();
		labScore = file.nextFloat();
		quizScore = file.nextFloat();

		// read through the file and store all assignments score into an array
		int length = file.nextInt();
		int[] assignScores = new int[length];
		for (int i = 0; i < length; i++) {
			assignScores[i] = file.nextInt();
		}

		// analysis assignment scores
		int highestAssignScore = 0;
		int lowestAssignScore = 101;
		int zeroPointTimes = 0;
		int totalScore = 0;
		double avarageAssignScore;

		for (int i = 0; i < length; i++) {
			if (assignScores[i] > highestAssignScore)
				highestAssignScore = assignScores[i];
			if (assignScores[i] < lowestAssignScore)
				lowestAssignScore = assignScores[i];
			if (assignScores[i] == 0)
				zeroPointTimes++;

			totalScore += assignScores[i];
		}
		avarageAssignScore = (double) totalScore / length;

		// deal with zero point assignments
		int[] zeroPointIndex = new int[zeroPointTimes];
		int zeroCount = 0;
		String zeroString = "";
		for (int i = 0; i < length; i++) {
			if (assignScores[i] == 0) {
				zeroPointIndex[zeroCount] = i;
				zeroString += i + " ";
				zeroCount++;
			}
		}

		// calculate the course grade
		double finalScore = examScore * 0.45 + avarageAssignScore * 0.35 + labScore * 0.1 + quizScore * 0.1;
		String letterGrade;
		if (finalScore >= 93)
			letterGrade = "A";
		else if (finalScore >= 90)
			letterGrade = "A-";
		else if (finalScore >= 87)
			letterGrade = "B+";
		else if (finalScore >= 83)
			letterGrade = "B";
		else if (finalScore >= 80)
			letterGrade = "B-";
		else if (finalScore >= 77)
			letterGrade = "C+";
		else if (finalScore >= 73)
			letterGrade = "C";
		else if (finalScore >= 70)
			letterGrade = "C-";
		else if (finalScore >= 67)
			letterGrade = "D+";
		else if (finalScore >= 63)
			letterGrade = "D";
		else if (finalScore >= 60)
			letterGrade = "D-";
		else
			letterGrade = "E";

		// print out the summary
		System.out.printf("Average assignment score:  %.2f \n", avarageAssignScore);
		System.out.println("" + "0 points on assignment(s): " + zeroString + "\n" 
				+ "Highest assignment score: " + highestAssignScore + "\n" 
				+ "Lowest assignment score: " + lowestAssignScore);
		System.out.printf("Course grade (numeric): %.2f \n", finalScore);
		System.out.println("Course grade (letter): " + letterGrade);
	}
}
