package _06_calculator;

import javax.swing.*;

public class calculator {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton();
JButton subtract = new JButton();
JButton multiply = new JButton();
JButton divide = new JButton();
JTextField input1 = new JTextField();
JTextField input2 = new JTextField();
public void setup() {
	frame.add(panel);
	panel.add(add);
	panel.add(divide);
	panel.add(multiply);
	panel.add(subtract);
	panel.add(input1);
	panel.add(input2);
	frame.pack();
	frame.setSize(370, 400);
	frame.setVisible(true);
	add.setBounds(140, 50, 80, 40);
	add.setText("+");
	subtract.setBounds(140, 110, 80, 40);
	subtract.setText("-");
	multiply.setBounds(140, 170, 80, 40);
	multiply.setText("X");
	divide.setBounds(140, 230, 80, 40);
	divide.setText("÷");
	//input1.setBounds();
}


public static void main(String[] args) {
	calculator calc = new calculator();
	calc.setup();
}
}
