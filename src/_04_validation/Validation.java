//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
		Random randomMaker = new Random();
		
		 int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if(randomNumber== 0) {
	System.out.println("Did you know that Earth wasn't habitable till approximately 4.5 Billion years ago");
} else if (randomNumber==1) {
	System.out.println("Despite Jurrasic World having the mosasaurus at 100 or so feet, the real largest mosausaur at most was only 30-40 feet.");
}
else if(randomNumber==2) {
	System.out.println("Fun fact jaekelopterus rhenaniae the largest extinct scorpion coming in at 8.2 feet in length makes the emperor scorpion's 9 inches look puny in comparison");
}
else if(randomNumber==3) {
	System.out.println("During the Carboniferous Period creepy crawlies. If you had entomophobia it would have beeen a real nightmare for you. Spiders the size of your face a huge dragonfly known as Meganeura with a wingspan of 70 centimeters plus a huge millipede called arthropleura armata, at seven feet in length and 1.5 feet you would want to find that in your house.");

}
else if(randomNumber==4) {
	System.out.println("There have been Five mass extinctions. The most well known being the extinction of the dinosaurs that took place about 65 million years ago. This is event is known as the Cretaceous Palogene extinction event. The Triassic, Permian-Triassic, late Devonian, and the Ordovician-Silurian are the other mass extinctions.");
}
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program.They will like it('<>')
	}
}
