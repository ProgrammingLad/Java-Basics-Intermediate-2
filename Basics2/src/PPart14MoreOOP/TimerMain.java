package PPart14MoreOOP;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{

	@Override
	public void run() {
		System.out.println("Timer");
	}
	
}
public class TimerMain {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);
	}
}
