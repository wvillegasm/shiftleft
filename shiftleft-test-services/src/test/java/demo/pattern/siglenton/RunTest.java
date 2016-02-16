package demo.pattern.siglenton;

public class RunTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{

		Thread t1 = new Thread(new ManyThread(), "-- 1");
		Thread t2 = new Thread(new ManyThread(), "-- 2");
		Thread t3 = new Thread(new ManyThread(), "-- 3");
		Thread t4 = new Thread(new ManyThread(), "-- 4");
		Thread t5 = new Thread(new ManyThread(), "-- 5");
		Thread t6 = new Thread(new ManyThread(), "-- 6");
		Thread t7 = new Thread(new ManyThread(), "-- 7");
		Thread t8 = new Thread(new ManyThread(), "-- 8");
		Thread t9 = new Thread(new ManyThread(), "-- 9");
		Thread t10 = new Thread(new ManyThread(), "-- 10");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();

	}

}
