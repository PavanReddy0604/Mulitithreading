package multithread;

public class MT01 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("checking the run method");
		for(int i=0;i<10;i++)
		{
			System.out.println("the value of i in mt1 is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MT01 mt1 = new MT01();
		Thread t = new Thread(mt1);
		MT02 mt2 = new MT02();
		mt2.start();
		t.start();
		

	}

}
