import java.io.*;

/**
 * Date: Jan 2021
 * Author: Hussain 
 * Description: J3: Art
 */

public class JuniorCCCPrepJ3_1 {

	// add throws IOException to handle errors
	public static void main(String[] args) throws IOException {

		// Setup keyboard input
		BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));

		// declare and input # of drops variable
		int numberOfDrops = Integer.parseInt(keyboard.readLine());

		// declare array variable for drops, x coordinates of drops, and y coordinates of drops
		// drops variable has however many elements as specified in line above
		String drops [] = new String [numberOfDrops];
		int dropsX [] = new int [numberOfDrops];
		int dropsY [] = new int [numberOfDrops];

		// use for loop to collect drop coordinates
		for (int i = 0; i < numberOfDrops; i++) {

			// splits all drops coordinates into first part (for x coordinate) and second part (for y coordinate)
			drops = keyboard.readLine().split(",");

			// x coordinate is declared as first part of drop coordinate (before comma)
			// y coordinate is declared as second part of drop coordinate (after comma)
			dropsX[i] = Integer.parseInt(drops[0]);
			dropsY[i] = Integer.parseInt(drops[1]);
		}

		// Use bubble sorting method to sort drops in ascending order

		// loop through entire array
		for (int j = 0; j < numberOfDrops; j++) {

			// loop to compare 2 elements next to each other
			for (int k = 0; k < numberOfDrops - 1; k++) {

				// compare one element to next
				if (dropsX[k] > dropsX[k + 1]) {

					// swap x coordinates if not in ascending order
					int tempNum = dropsX[k];
					dropsX[k] = dropsX[k+1];
					dropsX[k+1] = tempNum;
				}

				// do same for y coordinate
				if (dropsY[k] > dropsY[k + 1]) {

					int tempNum = dropsY[k];
					dropsY[k] = dropsY[k+1];
					dropsY[k+1] = tempNum;
				}

			}
		}

		// output 1 less than the lowest x and y coordinates of all drops and 1 more than the highest x and y coordinates of all drops
		// this is what makes up the rectangle
		System.out.println((dropsX[0] - 1) + "," + (dropsY[0] -1 )+ "\n" + (dropsX[numberOfDrops - 1] + 1) + "," + (dropsY[numberOfDrops - 1] + 1));
	
	}
}
