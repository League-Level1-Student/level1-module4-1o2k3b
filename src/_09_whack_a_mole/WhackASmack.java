package _09_whack_a_mole;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class WhackASmack implements ActionListener {
	Random r = new Random();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int score = 0;
	JLabel time = new JLabel();
	JLabel penalty = new JLabel();
	JButton[] buttons = new JButton[21];
	Color color = new Color(0, 100, 50);
	int i = 1;
	int tim = 60;
	public void drawButtons() throws InterruptedException {
frame.add(panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


for(i = 0; i<21; i++) {
	buttons[i] = new JButton();
	buttons[i].setOpaque(true);
	buttons[i].setBorderPainted(false);
	buttons[i].setBackground(Color.BLACK);
	buttons[i].addActionListener(this);
	panel.add(buttons[i]);
}
frame.setVisible(true);
frame.setSize(300, 350);
panel.add(time);
time.setOpaque(true);
time.setBackground(Color.gray);

while(true) {
	i = r.nextInt(21);
buttons[i].setBackground(color);
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
buttons[i].setBackground(Color.BLACK);
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
tim--;
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
tim--;
Thread.sleep(1000);
System.out.println("time: " + tim + "score: " + score);
tim--;
Thread.sleep(1000);
tim--;
System.out.println("time: " + tim + "score: " + score);
if(tim == 0) {
	break;
}

}
	}

		
	

public static void main(String[] args) throws InterruptedException {
	WhackASmack smack = new WhackASmack();
	smack.drawButtons();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(buttons[i])) {
		buttons[i].setBackground(Color.BLACK);
		score++;
	} else {
		score--;
	}
}


}
