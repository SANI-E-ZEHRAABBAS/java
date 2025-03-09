package lab1;

public class main {

	public static void main(String[] args) 
	{
        person p1 = new person();
        person p2 = new person();
        p1.displayinfo("sani", 18);
        p2.displayinfo("rida", 19);
        rectangle r1= new rectangle();
       System.out.println (r1.calculateArea(15, 18));
       calculator c1 =new calculator();
       calculator c2 =new calculator();
       System.out.println(c1.add(9, 100));
       System.out.println(c1.multiply(50, 100));
      Bankaccount b1 = new Bankaccount();
      b1.deposit(900);
      b1.display();
       Students s1 = new Students();
       s1.checkpass(28);
       
       

	}

}
