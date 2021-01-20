import java.io.*;

/**
 * 
 */

/**
 * Date: Jan 2021
 * Author: Hussain 
 * Description: J4: Cyclic Shifts
 */

public class JuniorCCCPrepJ4_1 {

	// add throws IOException to handle errors
	public static void main(String[] args) throws IOException {

		// setup keyboard input
		BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));

		// declare variables for Text, String to find, and checker for output
		// make another cyclic variable that is character (char) array type so we can manipulate each letter    

		String text = keyboard.readLine();
		String string = keyboard.readLine();
		String checker = "no";

		char cyclic[] = new char[string.length()];

		// set cyclic variable to string variable (remember, this is an array)
		cyclic = string.toCharArray();


		// loop through entire text length
		for (int j = 0; j < text.length(); j++) {

			// loop to check if string matches any portions 
			for (int k = 0; k < text.length() - string.length() + 1; k++) {

				// check if entire string is in text
				if (string.equals(text.substring(k, k + string.length()))) {
					checker = "yes";
				}

			}

			// if string is in text, break out of loop 
			if (checker.equals("yes")) {
				break;
			}

			// otherwise, shuffle and try again
			else {

				// make a temporary char variable first char of string
				char tempChar = cyclic[0];

				// loop through and shuffle each char
				for (int m = 0; m < string.length()-1; m++) {
					cyclic[m] = cyclic[m+1];	
				}

				// make last char in string the tempChar (which is first char)
				cyclic[string.length()-1] = tempChar;			

				// make string cyclic variable again (array)
				string = String.valueOf(cyclic);

			}

		}

		// output checker
		System.out.println(checker);

	}

}
