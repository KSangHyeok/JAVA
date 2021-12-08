import java.awt.Toolkit;

public class BeepPrintSample {

	public static void main(String[] args) {
		Thread bt1=new BeepTask1();
		bt1.start();
		Thread fi1=new BeepTask2();
		fi1.start();
//		Runnable bt = new BeepTask();
//		Thread thread = new Thread(bt);
//		thread.start();
		
//		Runnable pt = new Pibo();
//		Thread thread1 = new Thread(pt);
//		thread1.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("AAAAA");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

}
