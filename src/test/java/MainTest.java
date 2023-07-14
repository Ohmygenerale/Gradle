import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void sumTestA() {
        int a = 1;
        int b = 2;
        assertEquals(a + b, new Main().sumCalculator(a, b));

    }
    @Test
    public void sumTestB() {
        int a = -1;
        int b = 1;
        assertEquals(a + b, new Main().sumCalculator(a, b));
    }
}
