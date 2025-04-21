package lab4;

public class Employee {
	public double calculateBonus(int salary) {
        return salary * 0.05;
    }
	 public double calculateBonus(double salary, int rating) {
	        switch (rating) {
	            case 5: return salary * 0.20;
	            case 4: return salary * 0.15;
	            case 3: return salary * 0.10;
	            case 2: return salary * 0.05;
	            default: return 0.0;
	        }
	    }

}
