public class Main extends Thread{

	private TicketSystem ts;

	public Main(TicketSystem ts) {
		super();
		this.ts = ts;
	}

	public void run() {
		this.ts.bookTicket();
	}

	public static void main(String[] args) {
		TicketSystem ts = new TicketSystem();
		
		Main t1 = new Main(ts);
		Main t2 = new Main(ts);
		
		t1.start();
		t2.start();
	}
}
