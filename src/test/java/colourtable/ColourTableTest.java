package colourtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTableTest {
    @Test
    void testValidConstructor() {
        // Test ColourTable can be made with valid size input
        assertDoesNotThrow(() -> new ColourTable(4));
    }

    @Test
    void testInvalidConstructor() {
        // Test size less than 2
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1));
        // Test size with negative integer
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-8));
        // Test size with 0
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(0));
        // Test with size that is not a power of 2
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(9));
    }


}
