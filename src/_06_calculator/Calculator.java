package _06_calculator;




import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Map;

import javax.swing.*;

public class Calculator implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton();
JButton subtract = new JButton();
JButton multiply = new JButton();
JButton divide = new JButton();
JButton equal = new JButton();
JTextField input1 = new JTextField();
JTextField input2 = new JTextField();
JLabel output = new JLabel("hello", JLabel.CENTER);
double number = 0;


public void setup() {
	frame.add(panel);
	panel.add(add);
	panel.add(divide);
	panel.add(multiply);
	panel.add(subtract);
	panel.add(input1);
	panel.add(input2);
	panel.add(output);
	panel.add(equal);
	panel.setLayout(null);
	frame.pack();
	frame.setSize(370, 400);
	frame.setVisible(true);
	add.setBounds(140, 50, 80, 40);
	add.setText("+");
	add.addActionListener(this);
	subtract.setBounds(140, 110, 80, 40);
	subtract.setText("-");
	subtract.addActionListener(this);
	multiply.setBounds(140, 170, 80, 40);
	multiply.setText("X");
	multiply.addActionListener(this);
	divide.setBounds(140, 230, 80, 40);
	divide.setText("÷");
	divide.addActionListener(this);
	equal.setBounds(0, 0, 125, 80);
	equal.setOpaque(true);
	equal.setBorderPainted(false);
	equal.setBackground(Color.black);
	equal.setText("=");
	equal.setFont(new Font("Times New Roman", Font.BOLD, 40));
	equal.setForeground(Color.white);
	equal.addActionListener(this);
	input1.setBounds(30, 150, 90, 40);
	input2.setBounds(245, 150, 90, 40);
	output.setText("number = " + number);
	output.setBounds(0, 290, 370, 82);
	output.setFont(new Font("Times New Roman", Font.BOLD, 22));
	output.setOpaque(true);
	output.setBackground(Color.black);
	output.setForeground(Color.white);
	
}


public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.setup();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	String one = input1.getText();
	double first = Double.parseDouble(one);
	String two = input2.getText();
	double second = Double.parseDouble(two);
	
	if(e.getSource() == (multiply)) {
		number = first*second;
	}
	if(e.getSource() == (add)) {
		number = first+second;
	}
	if(e.getSource() == (subtract)) {
		number = first-second;
	}
	if(e.getSource() == (divide)) {
		number = first/second;
	}
	if(e.getSource() == (equal)) {
		output.setText("number = " + number);
	}
}

}
