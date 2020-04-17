package polymorphism.runtime.in;

public class TestOverriding {
	public static void main(String[] args) {
		
		Vehicle v1=new Car("Renault Duster");
		Vehicle v2=new Car("Hyundai 1.5");
		
		Vehicle v3=new Bike("Duke");
		Vehicle v4=new Bike("R15");
		
		System.out.println(v1.name);
		v1.start();
		v1.stop();
		
		System.out.println(v2.name);
		v2.start();
		v2.stop();
		System.out.println("-------------");
		
		System.out.println(v3.name);
		v3.start();
		v3.stop();
		
		System.out.println(v4.name);
		v4.start();
		v4.stop();
		
		
		
	}
}
