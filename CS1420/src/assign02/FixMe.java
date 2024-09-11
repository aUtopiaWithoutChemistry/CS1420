package assign02;

import java.util.Scanner;

/**
 * This program should:
 *  - Prompt the user to type a word, then read one in with a Scanner
 *  - Print the word in all lower case letters (like String's toLowerCase method)
 *  - Print the word in all upper case letters (like String's toUpperCase method)
 *  
 *  For example, if the user inputs "Hello!", the output should be:
 *  Lower case version: hello!
 *  Upper case version: HELLO!
 *  
 *  ... but it isn't working. Please fix it.
 *  You must NOT use String's toUpperCase or toLowerCase methods.
 *  
 *  @author Eric Heisler and Zifan Zuo
 *  @version Aug 29, 2024
 */
public class FixMe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word:");
        String word = input.next();
        String lowerCase = "";
        String upperCase = "";
        
        for(int i = 0; i < word.length(); i++) {
        	char letter = word.charAt(i);
        	// The difference between cases is 32
        	// so 'a' is 'A' + 32, 'b' is 'B' + 32, etc.
        	if(letter <= 'Z' && letter >= 'A') {
        		lowerCase += (char)(letter + 32); 
        		upperCase += letter;
        	} else if(letter >= 'a' && letter <= 'z') {
        		lowerCase += letter;
        		upperCase += (char)(letter - 32);
        	} else {
        		lowerCase += letter;
        		upperCase += letter;
        	}
        }
        
        System.out.println("Lower case version: " + lowerCase);
        System.out.println("Upper case version: " + upperCase);
        
        input.close();
    }
}
