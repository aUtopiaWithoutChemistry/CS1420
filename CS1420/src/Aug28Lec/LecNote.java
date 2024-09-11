package Aug28Lec;

import java.util.Random;

public class LecNote {
	public static void main(String[] args) {
		int number = 3;

		if ((number / 2 * 2) == number) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		// array
		String[] names = new String[160];
		// key word "new" to allocate resources to a new object

		// set elements for the array
		names[2] = "mia";

		// all the elements in an array are initialized as "null"
		// only reference types will be initialized as "null"

		int[] ages = new int[160];
		// length of arrays is a property rather than a method
		for (int i = 0; i < ages.length; i++) {

		}
		String[] names2 = new String[] { "cal", "art", "bla" };

		int[] arr = new int[900];
		// break, exit from a loop
		for (int i = 0; i < arr.length; i++) {
			if (i > 100) {
				System.out.println("Too much");
				break;
			}
		}

		// accumulation loop -- add all value together

		// optimization loop -- to find maximum or minimum value
		final int MAX_AGE = 122;
		int[] ages2 = new int[100];
		Random rand = new Random();

		for (int i = 0; i < ages2.length; i++) {
			ages2[i] = rand.nextInt(MAX_AGE);
			;
		}

		int total = 0;
		float average;
		int min = MAX_AGE;
		int max = -1;
		for (int i = 0; i < ages2.length; i++) {
			if (ages2[i] > max) {
				max = ages2[i];
			}
			if (ages2[i] < min) {
				min = ages2[i];
			}
			total += ages2[i];
		}
		average = (float) total / ages2.length;

		System.out.println("ave age is " + average + ", min is " + min + ", max is " + max + ".");

	}
}
