import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import test.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTest {


    @RepeatedTest(5)
    @DisplayName("Deposit successfully")
    public void testDeposit(BankAccount bankAccount) {
        bankAccount.deposit(200);
        assertEquals(200, bankAccount.getBalance());
    }



    @RepeatedTest(5)
    @DisplayName("Deposit successfully")
    public void testDepositRepetition(BankAccount bankAccount, RepetitionInfo repetitionInfo) {
        bankAccount.deposit(200);
        assertEquals(200, bankAccount.getBalance());
        System.out.println("Nr "+repetitionInfo.getCurrentRepetition());
    }
}
