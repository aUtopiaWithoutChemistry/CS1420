// CS 1420 Assignment 1 by Zifan Zuo (August 26, 2024)
package assign01;

public class DistanceCalculator {

	public static void main(String[] args) {
		int uid = 1536903;

		int mile, feet, inch, remain;

		mile = uid / 63360;
		remain = uid % 63360;
		feet = remain / 12;
		inch = remain % 12;

		System.out.println(uid + " inches is equivalent to " + mile + " miles, " + feet + " feet, and " + inch + " inches.");
	}

}
