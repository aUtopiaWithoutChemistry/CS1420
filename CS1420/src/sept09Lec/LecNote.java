package sept09Lec;

public class LecNote {

	public static void main(String[] args) {
//		preClassPractice();
		
		sayHi();
		System.out.println(add(5, 6));
		int[] numbers = {2, 5, 6, 7, 8, 9, 2};
		int index = findIndexOfLastGreater(numbers, 8);
		System.out.println(index);
	}
	
	private static void preClassPractice() {
		int[] numbers = {1, 3, 5, 7, 9, 7, 6, 2};
		int indexOfLastGreater = -1;
		int valueOfLastGreater = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 5) {
				indexOfLastGreater = i;
				valueOfLastGreater = numbers[i];
			}
		}
		
		if (indexOfLastGreater != -1)
			System.out.println("index is: " + indexOfLastGreater + " value is: " + valueOfLastGreater);
		else
			System.out.println("there are no number greater than 5.");
	}
	
	private static void sayHi() {
		System.out.println("Hi");
	}
	
	private static int add(int a, int b) {
		return a + b;
	}
	
	private static int findIndexOfLastGreater(int[] arr, int threshold) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > threshold) {
				index = i;
			}
		}
		return index;
	}
}
