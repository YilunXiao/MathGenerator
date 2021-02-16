package mathGenerator;
import java.util.HashMap;
import java.util.Random;

public class StringGen {
	
	private int xLower, xUpper, yLower, yUpper;
	private String operator = "+";
	String equation;
	HashMap<String, int[]> variables = new HashMap<String, int[]>();
	
	public StringGen() {
		/*
		xLower = 1;
		xUpper = 10;
		yLower = 1;
		yUpper = 10;
		*/
		int[] limit = {1, 10};
		variables.put("X", limit);
		variables.put("Y", limit);
	}
	
	public String genEquation() {
		int x = genVal(variables.get("X")[0], variables.get("X")[1]);
		int y = genVal(variables.get("Y")[0], variables.get("Y")[1]);
		equation = x + " " + operator + " " + y + " = "; 
		return equation;
	}

	public int genVal(int lower, int upper) {
		Random rand = new Random();
		return rand.nextInt(upper - lower) + lower;
	}
	
	public void setOp(String op) {
		operator = op;
	}
	
}
