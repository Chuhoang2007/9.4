import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void testTinhTong() {
        // Test đúng: 5 + 5 phải bằng 10
        assertEquals(10, Main.tinhTong(5, 5));
    }
    @Test
    public void testFilePath() {
        String path = Main.getFilePath();
        assertTrue(path.contains("\\"));
    }
}