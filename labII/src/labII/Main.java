package labII;
import java.util.Scanner;  
public class Main {

	public static void main(String[] args) {
	


		        Scanner input = new Scanner(System.in); 
		        System.out.println("Enter book name:");
		        String name = input.nextLine();  
		        Book b1 = new Book();
		        System.out.println(b1.issuebook(name)); 
		        System.out.println(b1.returnbook(name));
		        b1.showstatus(name);
		        
		        System.out.println("Enter your old password:");
		        int password = input.nextInt(); 
		        passwordmanager p1 = new passwordmanager();
		        p1.updatepassword(password);
		        
		        
		        
		        System.out.println("Enter your new password:");
		        int newpassowrd = input.nextInt(); 
		        passwordmanager p2 = new passwordmanager();
		        System.out.println(p2.validatepassword(newpassowrd));
		        Lightbulb l2 = new Lightbulb();
		        System.out.println("Do you want to turn on the bulb? (yes/no)");
		        String tell = input.nextLine();
		        if (tell.equals("yes")) {
		            l2.turnON();
		        } else {
		            l2.turnOFF();
		        }

		        l2.showStatus();
		        
		        TemperatureConverter t1 = new TemperatureConverter();

		        t1.setCelsius(36);
		        t1.toFahrenheit(); 

		        t1.setFahrenheit(29);
		        t1.toCelsius(); 


		        
		       
		    }


	}



