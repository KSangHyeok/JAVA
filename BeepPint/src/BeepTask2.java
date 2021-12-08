
public class BeepTask2 extends Thread {
	@Override
	public void run() {
		int a, b, c;
		a = 1;
		b = 1;
		c = 0;
		c = a + b;
		while (c < 1000) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
