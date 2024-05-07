package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.*;
import javax.swing.JOptionPane;

public class Magic8Ball {
	
	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random ran = new Random();
int random = ran.nextInt(4);
	// 3. Print out this variable
// no
	// 4. Get the user to enter a question for the 8 ball
while(true) {
	String input = JOptionPane.showInputDialog("give me a yes or no question");
	// 5. If the random number is 0
if(random == 0) {
	JOptionPane.showMessageDialog(null, "yes");
input = JOptionPane.showInputDialog("give me a yes or no question");
random = ran.nextInt(4);
}
	// -- tell the user "Yes"

	// 6. If the random number is 1

if(random == 1) {
	JOptionPane.showMessageDialog(null, "no");
input =	JOptionPane.showInputDialog("give me a yes or no question");
	random = ran.nextInt(4);
}
	// -- tell the user "No"

	// 7. If the random number is 2
if(random == 2) {
	JOptionPane.showMessageDialog(null, "next time ask google, I'm not your computer, just your local magic 8 ball");
input = JOptionPane.showInputDialog("give me a yes or no question");
	random = ran.nextInt(4);
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if(random == 3) {
	JOptionPane.showMessageDialog(null, "I'm on lunch break rn, come back when you actually have something important to say");
input = JOptionPane.showInputDialog("give me a yes or no question");
	random = ran.nextInt(4);
}
if(input.equals("quit")) {
	break;
}


	// -- write your own answer
}
}
}
