package PPart14MoreOOP;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable {

	@Override
	public void run() {
		int count = 0;
		while(count != 1) {
			count++;
			System.out.println(count);
		}
	}
	
}

public class TMain {

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task1(), 0, 1, TimeUnit.SECONDS);
	}
}
