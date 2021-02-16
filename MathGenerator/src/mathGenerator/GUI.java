package mathGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JTextField textfield;
	private JButton checkAnswer;
	private Font myFont = new Font("Arial", Font.BOLD, 30);
	
	//Constructor
	public GUI() {
		frame = new JFrame("Math Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(8, 4, 10, 10));
		//panel.setBackground(Color.gray);
		
		//Test Layout Position
		int numQuest = 14;
		StringGen equation = new StringGen();
		JButton button = new JButton("Button");
		JTextField[] textfieldArray = new JTextField[numQuest];
		JLabel[] labelArray = new JLabel[numQuest];
		for (int i=0; i<numQuest; i++) {
			labelArray[i] = new JLabel(equation.genEquation());
			textfieldArray[i] = new JTextField();
		}
        for (int i=0; i<labelArray.length; i++) {
			panel.add(labelArray[i]);
			panel.add(textfieldArray[i]);
		}
        panel.add(button);
		
		frame.add(panel);
		//frame.add(checkButton);
		//frame.add(textfield);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
