import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import test.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {


    @Test
    @DisplayName("Deposit successfully")
    public void testDeposit(BankAccount bankAccount) {
        bankAccount.deposit(200);
        assertEquals(200, bankAccount.getBalance());
    }

}
