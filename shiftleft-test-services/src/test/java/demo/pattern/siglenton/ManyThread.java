package demo.pattern.siglenton;

public class ManyThread implements Runnable {

	@Override
	public void run() {

		// int w = 100/this.pid; %1$tH:%1$tM:%1$tS.%1$tL %1$Tp
		// Thread: %2$s , Thread.currentThread().getName()
		System.out.printf("Created at: %1$tH:%1$tM:%1$tS.%1$tL %1$Tp Thread: %2$s\n", Singlenton.getInstance().getDate(), Thread.currentThread().getName());

		/*
		 * try { Thread.currentThread().wait((100/this.pid)); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 */
	}

}
