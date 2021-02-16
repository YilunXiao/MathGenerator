
public class EquationParse {
	
	private static int answer;
	private static String operator = "+";
	private static String delims = "[ ]+";
	
	
	public static void main(String[] args) {
		
		String equation = "2 - 5 = ";
		System.out.printf(equation + "%d", solveEqu(equation));
		
	}
	
	public static int solveEqu(String equation) {
		answer = 0;
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
			else operator = tokens[i];
		}
		
		return answer;
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	
	
	
	
	
}
