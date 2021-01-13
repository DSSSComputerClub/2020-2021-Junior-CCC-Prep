
import java.util.*;

/**
 * Date: Dec 2020
 * @author Hussain
 *	Description: J1: Dog Treats
 */

public class JuniorCCCPrepJ1_1 {
	
	public static void main(String[] args) {

		// declare variables for input
		int small;
		int medium;
		int large;
		
		// declare variable for score
		int score;
		
		// prepare keyboard for scanner input 
		Scanner input = new Scanner (System.in);
		
		// store the different inputs into each variable
		small = input.nextInt();
		
		medium = input.nextInt();
		
		large = input.nextInt();

		// close keyboard for scanner
		input.close();
		
		// calculate happiness score
		// input it into score variable
		score = (1*small) + (2*medium) + (3*large);
		
		// output happy if score is 10 or higher
		//otherwise output sad
		if (score >= 10) {
			System.out.print("happy");
		}
		
		else {
			System.out.print("sad");
		}
		
		
	}

}
