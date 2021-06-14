package PPart14MoreOOP;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Alert extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "Egg cooked");
	}
	
}

class Status implements Runnable{

	@Override
	public void run() {
		System.out.println("Timer running");
	}
	
}
public class TEggTimer {
	
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 20000, 20000);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Status(), 0, 10L, TimeUnit.SECONDS);
				
		
	}

}
