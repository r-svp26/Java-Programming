package org.innerclass.in;

public class LocalInnerDemo {

	public static void main(String[] args) {

		/* Local Inner Class */
		class Demo {
			int x = 10;

			void m1() {
				System.out.println("I'm m1()");
			}
		}

		Demo d = new Demo();
		System.out.println(d.x);
		d.m1();
		
		System.out.println("---Local----Inner---Class---Scenario----");
		
		LocalInnerDemo lid=new LocalInnerDemo();
		
	    lid.getRunnable();

	}

	/* Scenario to Use the Local Inner Class */
	Runnable getRunnable() {

		class RunnableObject implements Runnable {
			
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("JSPiders");
				}
			}
		}
		RunnableObject obj = new RunnableObject();
		return obj;
	}
}
