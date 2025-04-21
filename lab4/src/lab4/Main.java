package lab4;

public class Main {

	public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("Bonus (int salary): " + emp1.calculateBonus(10000));
        System.out.println("Bonus (double salary + rating): " + emp1.calculateBonus(10000.0, 4));
        System.out.println();
        Employee e1 = new Employee();
        Employee m1 = new Manager();
        Employee d1 = new Developer();

        e1.calculateSalary();  
        m1.calculateSalary();  
        d1.calculateSalary(); 
        System.out.println();
        
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal a : animals) {
            a.makeSound();
        }
        System.out.println();
        
        Employ e = new Employ();
        e.printDetails(123);
        e.printDetails("sami");
        e.printDetails(123, "sami");
        


	}

}
