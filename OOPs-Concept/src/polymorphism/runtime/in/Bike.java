package polymorphism.runtime.in;

public class Bike extends Vehicle {

	public Bike(String name) {
		super(name);
	}
	
	@Override
	public void start() {
		System.out.println("Bike has started...");
	}
	
	@Override
	public void stop() {
		System.out.println("Bike has stoped!");
	}

}
