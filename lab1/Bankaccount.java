package lab1;

public class Bankaccount {
    String accountnumber;
    double balance=1000;
   
    void deposit(double amount) {
    	balance=balance+amount;
    	

	}
    void display() {
    	System.out.println(balance);
    }

}
