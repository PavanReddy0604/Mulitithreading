package multithread;

public class MT02 extends Thread {

	public void run() {
		System.out.println("checking the run method");
		for (int i = 10; i >= 1; i--) {
			System.out.println("the value of i in mt2 is " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		MT02 mt2 = new MT02();
		/*if we set mt2 as a daemon thread , JVM may or may not execute the daemon threads
		 * the execution happens definitely as long as the user threads are alive .  
		 */
		//mt2.setDaemon(true);
		mt2.start();
		System.out.println("end of main");		
		

	}

}
