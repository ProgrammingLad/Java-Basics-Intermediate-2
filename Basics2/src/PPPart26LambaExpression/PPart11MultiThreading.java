package PPPart26LambaExpression;

public class PPart11MultiThreading {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {
			for(int i = 0; i < 100; i++) {
				System.out.println("Value of i: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
		
		System.out.println("Starting");
		
		t1.join();
		t2.join();


		
	}
}
