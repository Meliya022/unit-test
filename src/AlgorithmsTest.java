import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlgorithmsTest {

    @Test
    public void testReverseArrayWithCat() {
        Algorithms algorithms = new Algorithms();
        char[] input = {'c', 'a', 't'};
        char[] expected = {'t', 'a', 'c'};

        // Check if the method correctly reverses the array
        assertArrayEquals(expected, algorithms.reverseArray(input));
    }

    @Test
    public void testReverseArrayWithBand() {
        Algorithms algorithms = new Algorithms();
        char[] input = {'b', 'a', 'n', 'd'};
        char[] expected = {'d', 'n', 'a', 'b'};

        // Check if the method correctly reverses the array
        assertArrayEquals(expected, algorithms.reverseArray(input));
    }
}


