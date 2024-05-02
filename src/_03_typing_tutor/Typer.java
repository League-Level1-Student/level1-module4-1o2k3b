package _03_typing_tutor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typer implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel letter = new JLabel();
	char currentLetter;

	void setup(){
		
		frame.add(panel);
		currentLetter = generateRandomLetter();
		panel.add(letter);
		letter.setText(String.valueOf(currentLetter));
	letter.setFont(new Font("Times New Roman", Font.PLAIN, 30));
	letter.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 300);
	}
	
	public static void main(String[] args) {
		Typer type = new Typer();
		type.setup();
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		letter.setForeground(Color.yellow);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == currentLetter) {
			
		}
	}

}
