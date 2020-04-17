package polymorphism.runtime.in;

public class Car extends Vehicle {

	public Car(String name) {
		super(name);
	}
	
	@Override
	public void start(){
		System.out.println("Car has Started...");
	}

	@Override
	public void stop() {
		System.out.println("Car has stoped!");
	}
}
