import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int result = mainClass.getLocalNumber();
        Assertions.assertEquals(14, result, "метод getLocalNumber возвращает число 14");
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int result = mainClass.getClassNumber();
        Assertions.assertTrue(result > 45, "метод getClassNumber возвращает число больше 45");
    }
}