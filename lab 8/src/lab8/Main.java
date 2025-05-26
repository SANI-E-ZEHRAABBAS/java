package lab8;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Enter radius of the circle:");
    double radius = input.nextDouble();
    Circle c = new Circle();
    c.area(radius);
    System.out.println("Enter lenght and width of rectangle:");
    float lenght = input.nextFloat();
    float width = input.nextFloat();
   Rectangle r = new Rectangle();
   r.area(lenght,width);
   Book b = new Book();
   Magnize m = new Magnize();

   System.out.println("Printing Book:");
   b.print("The Alchemist", "Paulo Coelho");

   System.out.println("\nPrinting Magazine:");
  m.print("vogue", 39);
  Calculation calc = new Calculation();

  System.out.print("Enter first number: ");
  double num1 = input.nextDouble();

  System.out.print("Enter second number: ");
  double num2 = input.nextDouble();

  System.out.println("\nPerforming operations:");
  calc.add(num1, num2);
  calc.subtract(num1, num2);
  calc.multiply(num1, num2);
  calc.divide(num1, num2);
  Car ca = new Car();
  Bike bi = new Bike();
  Bus bu = new Bus();

  ca.start();
  bi.start();
  bu.start();
  Greeting.staticGreet(); // Static method (called via interface name)

  Welcome w = new Welcome(); // Object of implementing class
  w.sayHello("Ayaan");       // Abstract method
  w.sayGoodbye();      
    
    
    
    
   
    
	 }
}