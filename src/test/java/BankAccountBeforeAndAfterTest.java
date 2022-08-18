import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import test.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountBeforeAndAfterTest {

    static BankAccount bankAccount;

    /**
     * BeforeAll and AfterAll should be static and affects all methods.  With the TestInstance  you do not need make static.
     * BeforeEach and AfterEach is not static
     */

    @BeforeAll
    public void initClass() {
        System.out.println("Hi");
        bankAccount = new BankAccount(500, 0);
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(100);
        assertEquals(400, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(200);
        assertEquals(600, bankAccount.getBalance());
    }


    @AfterAll
    public void endClass() {
        System.out.println("Bye");
    }
}
