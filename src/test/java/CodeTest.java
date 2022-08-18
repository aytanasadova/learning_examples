import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.Code;

public class CodeTest {
    Code code;

    @BeforeEach
    public void initTest(){
        code=new Code();
    }

    @Test
    public void sayHelloTest(){
       assertEquals("Hello world!",code.sayHello());
    }
}
