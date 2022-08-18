import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BankAccountConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testForWIndows() {

    }

    @Test
    @EnabledOnOs({OS.MAC})
    public void testForMac() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_17})
    public void testForJRE() {

    }

    @Test
    @DisabledOnJre({JRE.JAVA_17})
    public void testForNoJRE() {

    }

    @Test
    @EnabledIfSystemProperty(named = "os.version",matches = "x")
    public void testForProperty() {

    }
}
