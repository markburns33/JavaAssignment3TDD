package colourtable;
import java.util.ArrayList;
import java.util.List;

public class ColourTable {

    public ColourTable(int size) {
        if (size < 2 || (size & (size-1)) !=0) {
            throw new IllegalArgumentException("Size must be a power of 2");
        }
    }
}