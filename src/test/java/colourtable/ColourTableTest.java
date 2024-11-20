package colourtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTableTest {
    @Test
    void testValidConstructor() {
        assertDoesNotThrow(() -> new ColourTable(4));
    }

    @Test
    void testInvalidConstructor() {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(9));
    }

}
