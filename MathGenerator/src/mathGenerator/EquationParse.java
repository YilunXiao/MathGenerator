package mathGenerator;

public class EquationParse {
	
	private String delims = "[ ]+";
	
	public String solveEqu(String equation) {
		
		int answer = 0;
		String operator = "+";
		String[] tokens = equation.split(delims);
		
		for (int i=0; i<tokens.length; i++) {
			if (isNumeric(tokens[i])) {
				switch (operator) {
				case "+": answer = answer + Integer.parseInt(tokens[i]);
					break;
				case "-": answer = answer - Integer.parseInt(tokens[i]);
					break;
				case "*": answer = answer * Integer.parseInt(tokens[i]);
					break;
				default: break;
				}
			}
			else if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")) {
				operator = tokens[i];
			}
			
		}
		
		String answerText = "" + answer;
		return answerText;
	}
	
	private boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	
}