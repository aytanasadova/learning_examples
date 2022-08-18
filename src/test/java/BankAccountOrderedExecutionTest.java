import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import test.BankAccount;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrderedExecutionTest {

    static BankAccount bankAccount = new BankAccount(0, 0);

    @Test
    @Order(2)
    public void testWithdraw() {
        bankAccount.withdraw(100);
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    @Order(1)
    public void testDeposit() {
        bankAccount.deposit(200);
        assertEquals(200, bankAccount.getBalance());
    }
}
