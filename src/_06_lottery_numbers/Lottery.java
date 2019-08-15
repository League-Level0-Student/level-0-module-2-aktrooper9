package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	Random randomMaker = new Random();
	int randomNumber=randomMaker.nextInt(60)+1;
	int randomNumber2=randomMaker.nextInt(60)+1;
	int randomNumber3=randomMaker.nextInt(60)+1;
	int randomNumber4=randomMaker.nextInt(60)+1;
	JOptionPane.showMessageDialog(null,"Your numbers are "+randomNumber+" "+randomNumber2+" "+randomNumber3+" "+randomNumber4);	}
}
