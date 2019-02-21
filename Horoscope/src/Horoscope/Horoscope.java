/**
 * Ben Blanchard
 * COSC 1437
 * 2/10/2019
 * Professor McClure
 */
package Horoscope;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Hello, the spirits have guided you here.\nPlease, they need the number of the month you were born in...");
		String birthMonth = reader.next();
		System.out.println("...you have done well. But they are still not pleased, they require the day of your birth...");
		String birthDate = reader.next();
		//would add more input validation however I do not have time to make this flawless
		if (Integer.parseInt(birthDate) < 10) {
			birthDate = "0" + birthDate;
		}
		//by concatenating these strings, and then converting them into an integer I can be lazier
		int bDay = Integer.parseInt((birthMonth + birthDate));
		System.out.println(Date.getFortune(bDay));
	}

}
