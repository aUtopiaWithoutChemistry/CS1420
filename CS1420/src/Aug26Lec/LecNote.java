package Aug26Lec;
import java.util.Scanner;

public class LecNote {

	public static void main(String args[]) {

		int onesDigit, tensDigit, hundredsDigit;

		onesDigit = 3;
		tensDigit = 5;
		hundredsDigit = 7;

		System.out.println("" + hundredsDigit + tensDigit + onesDigit);

		// web l103 Friday 12:00 - 14:00
		
		// Boolean data type
		// boolean operators: <, >, ==, != (not equal to), && (and), || (or), ! (not)
		// boolean expressions evaluate to true or false
		boolean x = 4 < 7;
		System.out.println(x);
		
		// for every reference type, == is comparing their location,
		// instead, we should use a.equals(b) to compare reference types.
		String a = "A";
		String b = "A";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		// we should not use == to directly compare floating point number,
		// instead, we should check if the answer is tolerable within some range
		double c, d, tolerance;
		c = 5.1 * 5.1;
		d = 26.01;
		tolerance = 0.00000000000001;
		System.out.println(c == d);
		System.out.println(Math.abs(c - d) < tolerance);
		
		// program flow
		// if, if else, while, for
		
		int age;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("input your age: ");
		age = myScanner.nextInt();
		myScanner.close();
		int i;
		for (i = 0; i < age; i++) {
			System.out.println("I'm not " + i);
		}
		System.out.println("I'm " + i);
	}
}
