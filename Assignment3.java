/*	Java Training Assignment 3 
	Date 3/10/2017
	Organizer: Jeshal Mehta
	Participant : Rehnuma Taraannum
	tarannum.rehnuma@gmail.com
*/
import java.util.*;
public class Assignment3 {
	public int wordCount(String sentence){
		
		/*	Getting rid of leading and trailing white Spaces
		 */
		sentence=sentence.trim();
		
		/*	Splitting string around whitespace and counting number of splits
		 */
		int words = sentence.isEmpty() ? 0 : sentence.split("\\s+").length;
		return words;
	}
	
	public StringBuilder upperLowerCase(String sentence){
		StringBuilder sbuilder = new StringBuilder(sentence);
		/*	Loop through the string builder object
		 */
		for (int i = 0; i < sbuilder.length(); i++) {
			/*	setting character to first character of the string 
				in string builder object
			*/
		    char character = sbuilder.charAt(i);
		    /*	Checking each character if it is lower case turn it into upper case
		        and vice-versa
		    */
		    if (Character.isLowerCase(character)) {
		        sbuilder.setCharAt(i, Character.toUpperCase(character));
		    } else {
		        sbuilder.setCharAt(i, Character.toLowerCase(character));
		    }
		}
		
		return sbuilder;
	}
	
	public int countSpecialCharacter(String sentence) {
		/*	List of Special Characters
		 */
		String SPECIAL_CHARACTERS_REGEX = "[!@#$%^&*()\\[\\]|;',./{}\\\\:\"<>?]";
		/*	Splits the string around matches of list of Regex 
		  	and then count the length of spits
		 */
		int count = sentence.split(SPECIAL_CHARACTERS_REGEX, -1).length-1;
		return count;
	}
	
	public int countWhiteSpace(String sentence) {
		int count=0;
		for (int i = 0; i < sentence.length(); i++) {
			if(Character.isWhitespace(sentence.charAt(i))) {
		        count++;
		    }
		}	
		return count;
	}
	
	public StringBuffer stringReverse(String sentence) {
		String[] words = sentence.split("\\s+");
		
		StringBuffer[] bufferWords = new StringBuffer[words.length];
		for (int i = 0; i < bufferWords.length; i++) {
			bufferWords[i] = new StringBuffer(words[i]);
			
		}
		
		StringBuffer reverseWords = new StringBuffer();
		for (int i = bufferWords.length-1; i >= 0; i--) {
			reverseWords.append(bufferWords[i].reverse());
			reverseWords.append(" ");
		}
		
		return reverseWords;
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("\nWELCOME TO THE STRING PROCESSING PROGRAM\n\tBY REHNUMA TARANNUM\n");
		System.out.println("Please enter a String");
		String s = reader.nextLine();
		
		

		Assignment3 a = new Assignment3();

		/*	The functions are called according to the order
			of the Questions
		*/

		int numWords=a.wordCount(s);
		System.out.println("\nThe number of words in given string are: "+numWords);
		
		System.out.println("\nThe converted string with upper case replace with lower case and vice-versa:\n"+a.upperLowerCase(s)+"\n");
		
		System.out.println("The number of special characters in given string are: "+a.countSpecialCharacter(s));
		
		System.out.println("\nThe number of white spaces in given string are: "+a.countWhiteSpace(s));

		
		System.out.println("\nThe Reversed String is "+a.stringReverse(s)+"\n");
		

	}

}
