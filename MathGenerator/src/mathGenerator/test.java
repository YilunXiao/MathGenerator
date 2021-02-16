package mathGenerator;

import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel; 

public class test {
	
	public static void main(String[] args) {
		
		//Test if math equation generator works
		/*
		String[] eqArray = new String[10];
		StringGen equation = new StringGen();
		for (int i=0; i<eqArray.length; i++) {
			eqArray[i] = equation.genEquation();
			System.out.println(eqArray[i]);
		}
		*/
		
		//Java Swing Example
		/*
		JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
		*/
		
		//Test Java Swing
		GUI test = new GUI();
		
	}

}
