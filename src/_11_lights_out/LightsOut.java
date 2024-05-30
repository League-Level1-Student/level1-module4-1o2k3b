package _11_lights_out;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel[] labels = new JLabel[25];

	int i = 1;
	int x = 0;

	public void LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		panel.setLayout(new GridLayout(5, 5));
		//2. Add 25 JLabels to your gamePanel (these are your lights)

		for(i = 0; i<25; i++) {

			labels[i] = new JLabel();
			panel.add(labels[i]);
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			//3. Use setText() to add a position number to each light (0-24).
			x = i+1;
			labels[i].setText("" + x);
			labels[i].setOpaque(true);
			labels[i].setBackground(Color.LIGHT_GRAY);
			labels[i].addMouseListener(this);
			labels[i].setFont(new Font(null).deriveFont(Font.BOLD, 35));
			Border border = BorderFactory.createLineBorder(Color.black, 3);
			labels[i].setBorder(border);
			//5. Add a mouseListener to each light
		}		
		//6. Add your panel to a frame

		//7. Set the size of the frame
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
		JLabel setter = (JLabel) e.getSource();
		// 2. Get the number (position) of the light
		String set = setter.getText();
		int find = Integer.parseInt(set);
		find--;
		// 3. Now use the makeMove method to code which lights turn on and off.
		makeMove(find);
		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

	}

	void makeMove(int pos) {
		toggle((JLabel) panel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) panel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) panel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) panel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) panel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) panel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);

		} else {
			label.setBackground(Color.white);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
	int r = 1;
	int y = 2;
	public void check() {
while(true) {
	labels[1 & 2 & 3 & 4 & 5 & 6 & 7 & 8 & 9 & 10 & 11 & 12 & 13 & 14 & 15 & 16 & 17 & 18 & 19 & 20 & 21 & 22 & 23 & 24 & 25].getBackground();
		if(labels[1 & 2 & 3 & 4 & 5 & 6 & 7 & 8 & 9 & 10 & 11 & 12 & 14 & 15 & 16 & 17 & 18 & 19 & 20 & 21 & 22 & 23 & 24 & 25].getBackground() == Color.WHITE && labels[13].getBackground() == Color.LIGHT_GRAY) {
	System.out.print("4");
}
if(labels[1].getBackground() == Color.white) {
	System.out.println("6");
}
}
	}
}
