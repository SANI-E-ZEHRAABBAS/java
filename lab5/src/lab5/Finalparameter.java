package lab5;

public class Finalparameter {
	 public double calculateArea(final double radius) {
	        // radius = radius + 1; // ❌ Error: cannot assign a value to final parameter
	        return 3.14 * radius * radius;
	    }

}
