import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import test.BankAccount;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParametrizedTestTest {

    @ParameterizedTest
    @ValueSource(ints = {100, 200, 500})
    @DisplayName("Deposit successfully")
    public void testDeposit(int amount, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance());
    }

    @ParameterizedTest
    @EnumSource(value =DayOfWeek.class,names= {"THURSDAY","TUESDAY"})
    @DisplayName("Deposit successfully")
    public void testDayOfWeek(DayOfWeek dayOfWeek) {
        assertTrue(dayOfWeek.toString().startsWith("T") );
    }

    @ParameterizedTest
    @CsvSource( {"Elvin, 20000","Aytan, 30000"})
    @DisplayName("Deposit successfully")
    public void depositAndNameTest(String name, double amount,BankAccount bankAccount) {
       bankAccount.deposit(amount);
       bankAccount.setHolderName(name);
       assertEquals(amount,bankAccount.getBalance());
       assertEquals(name,bankAccount.getHolderName());
    }

    @ParameterizedTest
//    @CsvSource( {"Elvin, 20000","Aytan, 30000"})
    @CsvFileSource(resources = "details.csv",delimiter = ',')
    @DisplayName("Deposit successfully")
    public void depositAndNameTestV1(String name, double amount,BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount,bankAccount.getBalance());
        assertEquals(name,bankAccount.getHolderName());
    }
}
