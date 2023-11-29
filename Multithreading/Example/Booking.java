public class TicketSystem {
	synchronized public void bookTicket() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getId() + ":" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
