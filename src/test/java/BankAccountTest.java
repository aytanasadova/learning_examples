import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.BankAccount;

import java.time.Duration;

@DisplayName("Bank account class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw successfully")
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(200);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit successfully")
    public void testDeposit(){
        BankAccount bankAccount=new BankAccount(500,-1000);
        bankAccount.deposit(300);
        assertEquals(800,bankAccount.getBalance());
    }
    @Test
    @DisplayName("Withdraw with errors")
    public void testWithdrawError(){
        BankAccount bankAccount=new BankAccount(400, 0);
        assertThrows(RuntimeException.class,()->bankAccount.withdraw(500),"Test failed");
    }

    @Test
    public void testWithdrawNotStuckAtZero(){
        BankAccount bankAccount=new BankAccount(400,-1000);
        bankAccount.withdraw(300);
        assertNotEquals(0,bankAccount.getBalance());
    }

    @Test
    public void balanceActivationTest(){
        BankAccount bankAccount=new BankAccount(199,0);
        assertTrue(bankAccount.isActive());
    }

    @Test
    public void holderNameSetTest(){
        BankAccount bankAccount=new BankAccount(199,0);
        bankAccount.setHolderName("Someone");
        assertNotNull(bankAccount.getHolderName());
    }

    @Test
    public void checkIfNoExceptionWithdrawAndDeposit(){
        BankAccount bankAccount=new BankAccount(199,0);
        assertAll(()->bankAccount.deposit(200),()->bankAccount.withdraw(10));
    }
    @Test
    public void testForDepositSpeed(){
        BankAccount bankAccount=new BankAccount(199,0);
        assertTimeout(Duration.ofMillis(20),()->bankAccount.deposit(200));
    }

    @Test
    public void testForFail(){
        BankAccount bankAccount=new BankAccount(199,0);
//        fail();
        assertTimeout(Duration.ofMillis(20),()->bankAccount.deposit(200));
    }
}
