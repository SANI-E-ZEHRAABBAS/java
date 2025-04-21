package lab5;

public class Person {

	 final String name;

	    // constructor to initialize final variable
	    public Person(String name) {
	        this.name = name;
	    }

	    public void changeName(String newName) {
	        // this.name = newName; // ❌ Error: cannot assign a value to final variable 'name'
	    }

}
