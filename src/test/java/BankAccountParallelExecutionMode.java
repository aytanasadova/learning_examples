import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import test.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParallelExecutionMode {

    @Test
    @DisplayName("Withdraw successfully")
    public void testDeposit1(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        bankAccount.deposit(200);
        assertEquals(200, bankAccount.getBalance());
    }


    @Test
    @DisplayName("Withdraw successfully")
    public void testDeposit2(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        bankAccount.deposit(200);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Withdraw successfully")
    public void testDeposit3(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        bankAccount.deposit(200);
        assertEquals(200, bankAccount.getBalance());
    }
}
