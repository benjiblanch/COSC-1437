/**
 * Ben Blanchard
 * 2/5/19
 * COSC 1437
 * Mrs. McClure
 */
package MicrowaveControl;

/*import the Random generator*/

import java.util.Random;

/*create class to simulate a very frustrating microwave*/
public class MicrowaveControl {
	Random generator = new Random();
	
	private int time = -30 + generator.nextInt(90);
	private int powerLvl = 1 + generator.nextInt(2);
	
	public static void main(String[] args) {
	}
	
	/*declare start method to handle string output and boolean comparisons of the simulation*/
	public void start() {
	System.out.println("Cooking for " + time + " seconds at power level " + powerLvl);
		if (time >= 20 && time < 30)
			if (powerLvl >= 1)
				System.out.println("It's perfectly cooked!");
		
		if (time < 20 && powerLvl >= 1)
			System.out.println("The burrito is cold in the middle.");
		
		if (time > 30 && powerLvl == 1)
			System.out.println("The burrito is cold in the middle.");
		
		if (time >= 30)
			if (powerLvl == 2)
			System.out.println("You burned the food.");
		
		if (time == 30 && powerLvl == 1)
			System.out.println("The microwave has burst into flames, you should run.");
	}
	
	/*declare method to add 30 seconds*/
	public void moreTime() {
		time = time + 30;
	}
	
	/*declare method to switch back and forth between power levels*/
	public void powerUp() {
		if (powerLvl == 1)
			powerLvl = 2;
		
		else
			powerLvl = 1;
		}
	
	/*declare method to reset the cook time*/
	public void reset() {
		time = 0;
	}
}