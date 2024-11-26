package colourtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ColourTableTest {

    // Test ColourTable can be made with valid size input
    @Test
    void testValidConstructor(){
        assertDoesNotThrow(() -> new ColourTable(4));
    }

    // Test invalid inputs for ColourTable
    @ParameterizedTest
    @ValueSource(ints={1,-8,0,9})
    void testInvalidConstructor(int size) {
        assertThrows(IllegalArgumentException.class,() -> new ColourTable(size));
    }

    // Test adding valid colours to ColourTable
    @Test
    void testAddValidColour() {
        ColourTable table = new ColourTable(4);

        assertDoesNotThrow(() -> table.add(255,0,0)); // Red
        assertDoesNotThrow(() -> table.add(0,255,0)); // Green
        assertDoesNotThrow(() -> table.add(0,0,255)); // Blue
        assertDoesNotThrow(() -> table.add(255,255,255)); // White

    }

    // Test adding invalid colours to ColourTable
    @Test
    void testAddInvalidColour() {
        ColourTable table = new ColourTable(4);

        assertThrows(IllegalArgumentException.class,() -> table.add(-1,0,0)); // Test number <0
        assertThrows(IllegalArgumentException.class,() -> table.add(0,0,256)); // Test number >256

    }


}
