package _10_slot_machine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton spin = new JButton();
JLabel money = new JLabel();
JLabel totalSpins = new JLabel();
JLabel one = new JLabel();
JLabel two = new JLabel();
JLabel three = new JLabel();



Color background = new Color(30, 180, 90);
Color red = new Color(175, 65, 40);

int coins = 50;
int spins = 0;

public void run() {
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


Icon icon = new ImageIcon("src/_10_slot_machine/homer.jpeg");

one.setIcon(icon);
two.setBounds(150, 25, 100, 150);

two.setOpaque(true);
three.setBounds(275, 25, 100, 150);
money.setBounds(50, 237, 50, 25);
money.setOpaque(true);
money.setText("$: " + coins);
totalSpins.setBounds(300, 237, 50, 25);
totalSpins.setOpaque(true);
totalSpins.setText("spun: " + spins);
three.setOpaque(true);
frame.pack();


}
public static void main(String[] args) throws InterruptedException {
	  Slot slot = new Slot();
	  slot.run();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	if(coins>=10) {
		spins++;
		coins-=10;
	} else {
		JOptionPane.showMessageDialog(null, "you lost your money you gambler, play again");
	}
	money.setText("$: " + coins);
	totalSpins.setText("spun: " + spins);
}
}
