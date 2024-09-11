package lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellCheck {

	public static void main(String[] args) {
		String word = "zoo";
		String current = "apple";
		System.out.println(word.compareTo(current) > 0);
		
		File file = new File("src/lab04/words.txt");
//		int wordCount = countWords(file);
//		System.out.println(wordCount);
		
//		String closestWord = getClosestWord("Geschwindigkeit", file);
//		System.out.println(closestWord);
		
		spellCheck(file);
	}
	
	/**
	 * Given a filename, this method returns a count of the number of
	 * words in the file. If the file cannot be opened, -1 is returned.
	 * 
	 * @param the name with path of a text file
	 * @return the count of words in the file or -1
	 */
	public static int countWords(File file) {
		// try to open the file
	    Scanner fileInput;
	    try {
	        fileInput = new Scanner(file);
	    }catch(FileNotFoundException e) {
	        return -1;
	    }
	    
	    // count words
	    int count = 0;
	    while (fileInput.hasNext()) {
	    	count++;
	    	fileInput.nextLine();
	    }
	    
	    fileInput.close();
	    return count;
	}
	
	
	private static String getClosestWord(String word, File file) {
		// try to open the file
	    Scanner fileInput;
	    try {
	        fileInput = new Scanner(file);
	    }catch(FileNotFoundException e) {
	        return "File not found";
	    }
	    
	    // to find the target string in the file
		String target = "";
		while (fileInput.hasNext()) {
			target = fileInput.next();
			if(word.compareTo(target) <= 0)
			    break;
		}
		
		fileInput.close();
		return target;
	}
	
	
	private static void spellCheck(File file) {
		Scanner userInput;
		while (true) {
			System.out.println("Type a word, if want to exit type 1453: ");
			userInput = new Scanner(System.in);
			String userWord = userInput.nextLine().toLowerCase();
			if (userWord.equals("1453")) {
				break;
			}
			String cloestWord = getClosestWord(userWord, file);
			if(userWord.equals(cloestWord)) 
				System.out.println("Input word \"" + userWord + "\" exists.");
			else
				System.out.println("Input word does not exists, do you mean \"" + cloestWord + "\"?");
			System.out.println("");
		}
		userInput.close();
	}
}
