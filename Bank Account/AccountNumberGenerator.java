import java.util.concurrent.atomic.AtomicInteger;
public class AccountNumberGenerator {
    private static final AtomicInteger counter = new AtomicInteger(1000);

    public static int getNextAccountNumber() {
        return counter.getAndIncrement();
    }
}
