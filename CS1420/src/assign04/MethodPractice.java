package assign04;

import java.util.Scanner;

/**
 * CS1420 assignment 04
 * @auther Zifan Zuo
 * @version Sep 11, 2024
 */
public class MethodPractice {
    public static void main(String args[]) {
        System.out.println("Checking sumInRange(-4, 10). Expecting a result of 45. The actual result is " + sumInRange(-4, 10) + ".");
        System.out.println("Checking shiftCipher(\"hello\", 3). Expecting a result of khoor. The actual result is " + shiftCipher("hello", 3) + ".");
        System.out.println("Checking countIntegerZeros(new Scanner(\"hello 0 10 0.0 string0 0\"). Expecting a result of 2. The actual result is " + countIntegerZeros(new Scanner("hello 0 10 0.0 string0 0")) + ".");
    }

    /**
     * convert from liter to gallon, return the value of gallon
     *
     * @param liters
     * @return gallon
     */
    public static int litersToGallons(double liters) {
        return (int)Math.floor(liters * 0.264172);
    }

    /**
     * to sum up all the integer between the beginning and ending number
     *
     * @param beginning
     * @param ending
     * @return sum
     */
    public static int sumInRange(int beginning, int ending) {
        int sum = 0;
        for(int i = beginning; i < ending + 1; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * convert a message based on the a given number to an encrypted
     * message
     *
     * @param message
     * @param enigma
     * @return encrypted message
     */
    public static String shiftCipher(String message, int enigma) {
        String code = "";
        for(int i = 0; i < message.length(); i++) {
            char nextChar;
            if (message.charAt(i) + enigma > 126)
                nextChar = (char)(message.charAt(i) + enigma - 126 + 31);
            else
                nextChar = (char)(message.charAt(i) + enigma);
            code += nextChar;
        }
        return code;
    }

    /**
     * take user input and count how many integer "0" in there.
     *
     * @param userInput
     * @return count
     */
    public static int countIntegerZeros(Scanner userInput) {
        int count = 0;
        String allUserInput = "";
        while (userInput.hasNext()) {
            allUserInput += userInput.next() + " ";
        }
        String[] separtedElements = allUserInput.split(" ");
        for (int i = 0; i < separtedElements.length; i++) {
            if (separtedElements[i].equals("0")) {
                count++;
            }
        }
        return count;
    }
}
