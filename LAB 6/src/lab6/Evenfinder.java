package lab6;

public class Evenfinder {

	 public void printEven(int[] arr) {
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.println();
	    }
}
