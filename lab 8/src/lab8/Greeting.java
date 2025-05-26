package lab8;

public interface Greeting {
	  void sayHello(String name); // abstract method

	    default void sayGoodbye() {
	        System.out.println("Goodbye! Have a nice day.");
	    }

	    static void staticGreet() {
	        System.out.println("Static Greeting: Welcome to the Java Interface Demo!");
	    }

}
