import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.Test;
import test.BankAccount;

import static org.junit.jupiter.api.Assertions.*;


public class BankAccountAssumptionTest {

    @Test
    public void balanceActivationTestRun(){
        BankAccount bankAccount=new BankAccount(199,0);
        assumeTrue(bankAccount!=null,"Bank account is null");
        assertTrue(bankAccount.isActive());
    }


    @Test
    public void balanceActivationTestAbort(){
        BankAccount bankAccount=null;
        assumeTrue(bankAccount!=null,"Bank account is null");
        assertTrue(bankAccount.isActive());
    }

    @Test
    public void balanceActivationTestAbortV1(){
      /** Just skips the executable block and the rest of the test method is still executed. */

        BankAccount bankAccount=null;
        assumingThat(bankAccount!=null,()-> assertTrue(bankAccount.isActive()));
    }
}
