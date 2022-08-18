import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import test.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountNestedTest {
    @Test
    @DisplayName("Withdraw successfully")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(200);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit successfully")
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.deposit(300);
        assertEquals(800, bankAccount.getBalance());
    }

    @Nested
    class whenBalanceEqualsZero {

        @Test
        void testWithDrawMinimumBalanceIs0() {
            BankAccount bankAccount = new BankAccount(0, 0);
            assertThrows(RuntimeException.class, () -> bankAccount.withdraw(100));
        }

        @Test
        void testWithDrawMinimumBalanceNegative1000() {
            BankAccount bankAccount = new BankAccount(0, -1000);
            bankAccount.withdraw(100);
            assertEquals(-100, bankAccount.getBalance());
        }


    }
}
