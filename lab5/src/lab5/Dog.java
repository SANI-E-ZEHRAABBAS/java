package lab5;

public class Dog extends Animal {
	// ❌ This will cause an error
    public void makeSound() {
        System.out.println("Dogs bark");
    }
    //A final method cannot be overridden in a subclass. 
	

}
