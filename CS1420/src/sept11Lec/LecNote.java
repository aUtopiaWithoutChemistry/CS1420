package sept11Lec;

/**
 * LectureNote
 *
 * @author Zifan Zuo
 * @version Sep 11, 2024
 */
public class LecNote {

	public static void main(String[] args) {
		double original = 2.79;
		int percentage = 30;
		double sale = salePrice(original, percentage);
		System.out.printf("sale price is: %.2f", sale);
	}

	/**
	 * To calculate the final sale price based on original price and percentage of discount
	 *
	 * @param original
	 * @param percentage
	 * @return the final sale price
	 */
	private static double salePrice(double original, int percentage) {
		return (100 - percentage) * original / 100;
	}
	
	// method signature is the name and type of parameters
	// because we only have the name and series of parameter
	// to identify which method we are calling.
	
	// Documentation
	// Three type of comments
	// first: online
	/*
	* second: multi-lines
	* */
	/**
	 * third: java-doc comment
	 * Description
	 * @param
	 * @return
	 * @throws exceptions
	 */

	// Code Contract
	// we should write contract for every method

	// scope

	// arguments and return statements pass values, not variable

	// two method, one is to create array, pass that array to another method

	/**
	 * using a loop to create an array containing all the non-negative whole number under
	 * a certain count, and then print out all the elements in this array
	 * @param count
	 */
	private static void creatArrayAndPrint(int count) {
		int[] array = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = i;
		}
		printArray(array);
	}

	/**
	 * to print out all the elements in an array
	 * @param array
	 */
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
