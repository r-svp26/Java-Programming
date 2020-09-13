package orgs.anonymous.in;

public class Sample {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		class MyComparable implements Comparable {

			@Override
			public int compareTo(Object arg0) {
				return 20;
			}
		}

		@SuppressWarnings("unused")
		MyComparable mc = new MyComparable();

		/* Anonymous Class */
		@SuppressWarnings({ "rawtypes", "unused" })
		Comparable cmpr = new Comparable() {

			@Override
			public int compareTo(Object o) {
				return 450;
			}
		};

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println("JSpiders");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++)
					System.out.println("QSpiders");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t2.start();

	}
}
