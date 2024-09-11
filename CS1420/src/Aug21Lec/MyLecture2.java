package Aug21Lec;
import java.util.Scanner;
import java.lang.Math;

public class MyLecture2 {

	public static void main(String[] args) {

		// notes
//		int length = 8; // 8 is both value and literal
//		
//		String name = "hofhsohfoehw";
//		System.out.print(name.substring(0,4));
		
		// get user input
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please input the width and height(using space to separate): ");
		int width = myScanner.nextInt();
		int height = myScanner.nextInt();
		triangle(width, height);
	}
	
	private static void triangle(int width, int height) {
		System.out.println("Perimeter is " + (width + height + Math.sqrt(width*width + height*height))); 
		System.out.println("Area is " + (width * height) / 2);
	}

}
