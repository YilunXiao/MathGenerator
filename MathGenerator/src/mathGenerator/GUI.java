package mathGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
	
	private int numQuest = 14;
	private StringGen equation = new StringGen();
	private EquationParse parser = new EquationParse();
	private JFrame frame;
	private JPanel panel;
	private JTextField[] textfieldArray = new JTextField[numQuest];
	private JButton opAdd, opSub, opMul, opDiv;
	private JButton checkAnswer, reset;
	private Font myFont = new Font("Arial", Font.BOLD, 15);
	private JLabel[] labelArray = new JLabel[numQuest];
	
	//Constructor
	public GUI() {
		frame = new JFrame("Math Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 600);
		frame.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(50, 50, 300, 500);
		panel.setLayout(new GridLayout(10, 4, 10, 10));
		//panel.setBackground(Color.gray);
		
		//Set Layout Position
		//BUTTONS
		checkAnswer = new JButton("check");
		reset = new JButton("reset");
		opAdd = new JButton("+");
		opSub = new JButton("-");
		opMul = new JButton("*");
		opDiv = new JButton("/");
		checkAnswer.addActionListener(this);
		reset.addActionListener(this);
		opAdd.addActionListener(this);
		opSub.addActionListener(this);
		opMul.addActionListener(this);
		checkAnswer.setBounds(50, 460, 145, 50);
		reset.setBounds(205, 460, 145, 50);
		//BUTTON and TEXT POSITION
		for (int i=0; i<numQuest; i++) {
			labelArray[i] = new JLabel(equation.genEquation(), 0);
			textfieldArray[i] = new JTextField();
			
			labelArray[i].setFont(myFont);
			
			labelArray[i].setOpaque(true);
			
			panel.add(labelArray[i]);
			panel.add(textfieldArray[i]);
		}
		panel.add(opAdd);
		panel.add(opSub);
		panel.add(opMul);
		panel.add(opDiv);
        
		frame.add(checkAnswer);
        frame.add(reset);
		
		frame.add(panel);
		//frame.add(checkButton);
		//frame.add(textfield);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == checkAnswer) {
			String answer, equ;
			for (int i=0; i<numQuest; i++) {
				equ = labelArray[i].getText();
				answer = textfieldArray[i].getText();
				if (answer.equals(parser.solveEqu(equ))) {
					labelArray[i].setBackground(Color.green);
					
				}
				else {
					labelArray[i].setBackground(Color.red);
					//textfieldArray[i].setText(parser.solveEqu(equ));
				}
			}
			
			//textfield.setText(textfield.getText().concat(String.valueOf(i)));
		}
		
		if (e.getSource() == reset) {
			reset();
		}
		
		if (e.getSource() == opAdd) {
			equation.setOp("+");
			reset();
		}
		if (e.getSource() == opSub) {
			equation.setOp("-");
			reset();
		}
		if (e.getSource() == opMul) {
			equation.setOp("*");
			reset();
		}
		/*
		if (e.getSource() == opDiv) {
			//Not sure how to impliment division yet
		}
		*/
	}
	
	public void reset() {
		for (int i=0; i<numQuest; i++) {
			labelArray[i].setText(equation.genEquation());
			labelArray[i].setBackground(null);
			textfieldArray[i].setText("");
		}
	}
	

}
