package lab6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Calculate c1= new Calculate();
		System.out.println( "The square root is "+c1.findsquareroot(25));
		RandomNumber r1= new RandomNumber();
		r1.generate();
		Scanner input = new Scanner(System.in);
		System.out.println("enter base");
		 double Base=input.nextDouble();
		 System.out.println("enter exponent");
		double exponent = input.nextDouble();
		System.out.println("power calculation is"+c1.calcpower(Base, exponent));
		System.out.println("enter a");
		 int a=input.nextInt();
		 System.out.println("enter b");
		int b = input.nextInt();
		System.out.println("The difference is"+c1.findDifference(a, b));
		Findmax mf = new Findmax();
	        System.out.print("Enter three numbers: ");
	        int d = input.nextInt(), e = input.nextInt(), f = input.nextInt();
	        System.out.println("Maximum number: " + mf.findMaximum(d, e, f));
	        int[] numbers = {5, 10, 15, 20, 25};
	        ArraySum as = new ArraySum();
	        int total = as.calculateSum(numbers);
	        System.out.println("Sum of array elements: " + total);
	        int[] arr = {12, 45, 7, 89, 34};
	        Arraymaximum obj = new Arraymaximum();
	        int max = obj.findMax(arr);
	        System.out.println("Maximum element: " + max);
	        int[] array = {1, 2, 3, 4, 5};
	        Arrayreverse a1 = new Arrayreverse();
	        System.out.print("Reversed array: ");
	        a1.printReverse(array);
	        int[] arr2 = {10, 13, 22, 5, 8, 7, 6, 15, 2, 9};
	        Evenfinder ev = new Evenfinder();
	        System.out.print("Even numbers: ");
	        ev.printEven(arr2);
	        
	    }
	    }

	


