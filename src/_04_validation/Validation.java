//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		 int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if(randomNumber== 0) {
	System.out.println("Did you know that Earth was habitable till approximately 4.5 Billion");
} else if (randomNumber) {
	System.out.println("Despite Jurrasic World having the mosasaurus at 100 or so feet a real mosasaur was only 30-40 people.");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program.They will like it('<>')
	}
}
