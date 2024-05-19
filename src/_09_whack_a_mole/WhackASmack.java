package _09_whack_a_mole;

import java.awt.Color;

import javax.swing.*;

public class WhackASmack {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton[] Buttons = new JButton[21];
	int i = 1;
	public void drawButtons() {
frame.add(panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

for(i = 0; i<21; i++) {

	Buttons[i] = new JButton();
	Buttons[i].setBackground(Color.black);
	panel.add(Buttons[i]);

}
frame.setVisible(true);
frame.setSize(300, 275);
}

public static void main(String[] args) {
	WhackASmack smack = new WhackASmack();
	smack.drawButtons();
}

}
