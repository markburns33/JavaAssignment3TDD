package colourtable;
import java.util.ArrayList;
import java.util.List;

public class ColourTable {

    private final List<int[]> colours;

    public ColourTable(int size) {
        if (size < 2 || (size & (size-1)) !=0) {
            throw new IllegalArgumentException("Size must be a power of 2");
        }
        this.colours = new ArrayList<>();
    }

    public void add(int red, int green, int blue) {
        colours.add(new int[]{red, green, blue});
    }
}