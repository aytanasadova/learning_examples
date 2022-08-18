import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import test.BankAccount;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BankAccountDisabledTest {
    @Test
    @Disabled("Temporarily disabled due to maintenance")
    public void balanceActivationTestRun(){
        BankAccount bankAccount=new BankAccount(199,0);
        assumeTrue(bankAccount!=null,"Bank account is null");
        assertTrue(bankAccount.isActive());
    }


}
