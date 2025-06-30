import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(1000.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance(), 0.01);
    }

    @After
    public void tearDown() {
        account = null;
    }
}