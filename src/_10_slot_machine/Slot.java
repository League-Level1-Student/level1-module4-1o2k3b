package _10_slot_machine;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Slot implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton spin = new JButton();
JLabel money = new JLabel();
JLabel totalSpins = new JLabel();
JLabel one = new JLabel();
JLabel two = new JLabel();
JLabel three = new JLabel();

Random whichOne = new Random();
int forRandom = 0;
volatile boolean bool = false;
Color background = new Color(30, 180, 90);
Color red = new Color(175, 65, 40);

int coins = 50;
int spins = 0;

public void makeIcon(String name, JLabel whichSet) {
	ImageIcon icon = new ImageIcon("src/_10_slot_machine/" + name); // load the image to a imageIcon
	java.awt.Image image = icon.getImage(); // transform it 
	java.awt.Image newimg = image.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
	ImageIcon lemon = new ImageIcon(newimg);  // transform it back
	whichSet.setIcon(lemon);
}
public void whichIcon(JLabel which) {
	forRandom = whichOne.nextInt(3);
	if(forRandom == 0) {
		makeIcon("lemon.jpeg", which);
	}
	if(forRandom == 1) {
		makeIcon("cherry.jpeg", which);
	}
	if(forRandom == 2) {
		makeIcon("seven.jpeg", which);
	}
}
public void setup() throws InterruptedException {
frame.add(panel);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

panel.add(spin);
panel.add(money);
panel.add(totalSpins);
panel.add(one);
panel.add(two);
panel.add(three);
panel.setBackground(background);
panel.setLayout(null);
panel.setPreferredSize(new Dimension(400, 300));

spin.setBounds(150, 225, 100, 50);
spin.setBorderPainted(false);
spin.setOpaque(true);
spin.addActionListener(this);
spin.setBackground(red);
spin.setText("SPIN");
spin.setFont(new Font(null).deriveFont(Font.BOLD, 25));

one.setBounds(25, 25, 100, 150);
one.setOpaque(true);

two.setBounds(150, 25, 100, 150);
two.setOpaque(true);

three.setBounds(275, 25, 100, 150);
three.setOpaque(true);

whichIcon(one);
whichIcon(two);
whichIcon(three); 

money.setBounds(50, 237, 50, 25);
money.setOpaque(true);
money.setText("$: " + coins);


totalSpins.setBounds(300, 237, 50, 25);
totalSpins.setOpaque(true);
totalSpins.setText("spun: " + spins);

frame.pack();

spin();


}
public void spin() throws InterruptedException {
	if(bool == true) {
		System.out.println("please");
				spins++;
			if(coins>=10) {
				coins-=10;
				for(int many = 50; many<500; many+=50) {
				whichIcon(one);
				whichIcon(two);
				whichIcon(three); 
				Thread.sleep(many);
				}
			
			} else {
				JOptionPane.showMessageDialog(null, "you lost your money you gambler, play again");
			}
			money.setText("$: " + coins);
			totalSpins.setText("spun: " + spins);
			bool = false;
			System.out.println(bool);
		}
	}

public static void main(String[] args) throws InterruptedException {
	  Slot slot = new Slot();
	  slot.setup();
	  while(true) {
		  slot.spin();
	  }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		bool = true;
		System.out.println(bool);
}

}
