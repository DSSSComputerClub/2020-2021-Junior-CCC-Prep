import java.io.*;

/**
 * 
 */

/**
 * @author Hussain
 *
 */
public class OccupyParking {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// setup keyboard input
		BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
		
		int numberOfSpaces = Integer.parseInt(keyboard.readLine());
		
		String yesterday = keyboard.readLine();
		String today = keyboard.readLine();
		
		char yesterdayParking [] = yesterday.toCharArray();  
		char todayParking [] = today.toCharArray();

		int sum = 0; 
		
	
		
		for (int i = 0; i < numberOfSpaces; i++) {
			
			if	(yesterdayParking[i] == todayParking[i] && todayParking[i]== ('C')){
				
				sum = sum +1;
				
			}
			
		}
		
		
		System.out.println(sum);
		
		
	}

}
