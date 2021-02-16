package mathGenerator;
import java.util.Random;

public class Equation {
	
	private int var1, var2, answer;
	private char operator;
	
	public Equation() {
		operator = '+';
	}
	public Equation(char operation) {
		operator = operation;
	}
	
	public int genVal(int lower, int upper) {
		Random rand = new Random();
		return rand.nextInt(upper - lower) + lower;
	}

}
