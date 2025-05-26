package lab8;

public class Calculation implements Operations {
	 public void add(double a, double b) {
	        System.out.println("Addition: " + (a + b));
	    }

	    public void subtract(double a, double b) {
	        System.out.println("Subtraction: " + (a - b));
	    }

	    public void multiply(double a, double b) {
	        System.out.println("Multiplication: " + (a * b));
	    }

	    public void divide(double a, double b) {
	        if (b != 0) {
	            System.out.println("Division: " + (a / b));
	        } else {
	            System.out.println("Error: Cannot divide by zero.");
	        }

	

}
}
