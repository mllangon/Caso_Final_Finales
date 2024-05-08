import Ejercicio_3.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testRecursive() {
        assertEquals(1, Main.recursive(1, 0));
        assertEquals(0, Main.recursive(0, 5));
        assertEquals(0, Main.recursive(5, -1));
        assertEquals(25, Main.recursive(5, 2));
    }
}