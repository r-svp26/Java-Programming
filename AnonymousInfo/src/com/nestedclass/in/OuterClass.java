package com.nestedclass.in;

public class OuterClass {

	int x1 = 90; // Instance Variable
	static int y1 = 45; // Static Variable

	int x = 100;
	static int y = 200; 

	static class NestedClass {

		int x = 10; // Instance Variable
		static int y = 45; // Static Member 
		
		/* Nested Class instance method */
		void m1() {
			System.out.println(y1);

			OuterClass oc = new OuterClass();
			System.out.println(oc.x1);

			System.out.println(x);
			System.out.println(oc.x); // 100

			System.out.println(y); // 45
			System.out.println(OuterClass.y); // 200
		}

		/* Nested Class static method */
		static void m2() {
			System.out.println(y1);

			OuterClass out = new OuterClass();
			System.out.println(out.x1);
		}
	}
}
