public class Mythread extends Thread {
	private String name;

	public Mythread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		Mythread t1 = new Mythread("First");
		Mythread t2 = new Mythread("Second");

		System.out.println("Thread of main started..");
		System.out.println("Starting t1 thread..");
		t1.start();
		System.out.println("Statring t2 thread..");
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread of main ends...");

	}

}
