package multithread;

public class Company {

	int n;
	boolean f = true;

	synchronized public void produce_item(int n) throws InterruptedException {
		if (f==true) {
			wait();
		}
		this.n = n;
		System.out.println("produced = " + this.n);
		f = true;
		notify();

	}

	synchronized public int consume_item() throws InterruptedException {
		if (f==false) {
			wait();
		}

		System.out.println("consumed = " + this.n);
		f = false;
		notify();
		return this.n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company comp = new Company();
		Producer p = new Producer(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();

	}

}
