import Ejercicio_4.SumaDigitos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaDigitosTest {

    @Test
    public void testSumaDigitos() {
        assertEquals(3, SumaDigitos.sumaDigitos(102));
        assertEquals(6, SumaDigitos.sumaDigitos(123));
        assertEquals(0, SumaDigitos.sumaDigitos(0));
        assertEquals(5, SumaDigitos.sumaDigitos(-5));
    }
}