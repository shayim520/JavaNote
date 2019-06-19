package day44;

public class MathEquation {
	

	  private double operand1;
	  private double operand2;
	  private double result;
	  private char operator;
	  
	  public MathEquation() {
	    System.out.println("no arg");
	  }

	  public MathEquation(double operand1, double operand2, char operator) {
	    this.operand1 = operand1;
	    this.operand2 = operand2;
	    this.operator = operator;
	  }

	  public void calculate() {
	    
	    switch (operator) {

	      case '+':
	        result = operand1 + operand2;
	        break;
	      case '-':
	        result = operand1 - operand2;
	        
	        break;
	      case '*':
	        result = operand1 * operand2;
	        
	        break;
	      case '/':
	        result = operand1 / operand2;      
	        break;
	      
	      default: 
	        System.out.println("INVALID @@@!!!");
	      
	    }

	    
	  }
	  


	  public double getOperand1() {
	    return operand1;
	  }
	  public void setOperand1(int operand1) {
	    this.operand1 = operand1;
	  }
	  public double getOperand2() {
	    return operand2;
	  }
	  public void setOperand2(int operand2) {
	    this.operand2 = operand2;
	  }
	  public char getOperator() {
	    return operator;
	  }
	  public void setOperator(char operator) {
	    this.operator = operator;
	  }
	  public double getResult() {
	    return result;
	  }
	  
	  public String toString() {
	    return "MathEquasion [operand1=" + operand1 + ", operand2=" + operand2 + ", result=" + result + ", operator="
	        + operator + "]";
	}
	
	

}
