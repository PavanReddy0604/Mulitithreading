package multithread;

public class MT03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("**** Started *****");
		int a = 9 + 78;
		System.out.println("sum is " + a);
		Thread ct = Thread.currentThread();
		String t = ct.getName();
		System.out.println("current name of the thread is :" + t);
		ct.setName("newthread");
		String nt = ct.getName();
		Thread.sleep(1000);
		System.out.println("current new name of the thread is :" + nt);
		Thread.sleep(1000);
		System.out.println(ct.getId());

	}

}
