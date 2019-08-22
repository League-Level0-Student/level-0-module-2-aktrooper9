
 
package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
	
		
		for(int i=0;i<100;i+=1) {
			
		

		String input=JOptionPane.showInputDialog("What is your favorite animal between a cow, duck, llama, or  dog?");
		if(input.equals("cow")) {
			playMoo();
		}
		
		else if(input.equals("duck")) {
			playQuack();
		}
		else if(input.equals("llama")) {
			playBaa();
		}
		else if(input.equals("dog")) {
			playWoof();
		}
		else { JOptionPane.showMessageDialog(null,"sorry we do not have that sound");}		/* 2. Make it so that the user can keep entering new animals. */
	}}
		
	

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playBaa() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
