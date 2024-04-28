package _01_chuckle_clicker;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Laugh implements MouseListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punch = new JButton();
	JLabel output = new JLabel();
	Color goodBlue = new Color(0, 75, 125);
	Color darkBlue = new Color(25, 50, 175);
	Color goodGreen = new Color(10, 155, 60);
	Color goodRed = new Color(175, 40, 60);
			
	public void MakeButtons() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(350, 250);
		frame.add(panel);
		panel.add(joke);
		panel.add(punch);
		panel.add(output);
		panel.setBackground(goodBlue);
		joke.addMouseListener(this);
		joke.setText("joke");
		joke.setBackground(goodGreen);
		joke.setBounds(50, 50, 50, 25);
		punch.addMouseListener(this);
		punch.setText("punchline");
		punch.setBackground(goodRed);
		punch.setBounds(350, 50, 100, 25);
		output.setBounds(50, 125, 300, 80);
		output.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		output.setText("this is where the joke will appear");
		output.setBackground(darkBlue);
		output.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		output.setFont(new Font("serif", Font.BOLD, 15));
		output.setOpaque(true);


		
	}
	
	public static void main(String[] args) {
		Laugh laugh = new Laugh();
		laugh.MakeButtons();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(joke.equals(e.getSource())) {
			output.setText("why didn't the skeleton go to the ball?");
		} else {
			output.setText("because he didn't have the guts.");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
