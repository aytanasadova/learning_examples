import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import test.BankAccount;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountTimeOutTest {

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)

        void testDepositTimeoutAnnotation(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        bankAccount.deposit(300);
        Assertions.assertEquals(300, bankAccount.getBalance());
    }

    @Test
    void testDepositTimeoutAssertion(BankAccount bankAccount) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        bankAccount.deposit(300);
        Assertions.assertTimeout(Duration.ofMillis(300),()->{Thread.sleep(100);});
    }

}
