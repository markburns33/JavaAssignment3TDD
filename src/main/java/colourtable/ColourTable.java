package colourtable;
import java.util.ArrayList;
import java.util.List;

public class ColourTable {

    private final int maxCapacity;
    private final List<int[]> colours;

    public ColourTable(int size) {
        if (size < 2 || (size & (size-1)) !=0) {
            throw new IllegalArgumentException("Size must be a power of 2");
        }
        this.maxCapacity = size;
        this.colours = new ArrayList<>();
    }

    public void add(int red, int green, int blue) {

        // Check valid colour
        if (red < 0 || green < 0 || blue < 0 || red > 255 || green > 255 || blue > 255) {
            throw new IllegalArgumentException("Invalid colour");
        }

        // Check if list is at capacity
        if (colours.size() >= maxCapacity) {
            throw new IllegalStateException("Too many colours -- colour list is full");
        }
        // if valid colour, and list is not at capacity, add to colours list
        colours.add(new int[]{red, green, blue});
    }
}