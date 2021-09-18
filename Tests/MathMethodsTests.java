import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathMethodsTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }



    @Test
    void TemperatureDifferenceTest() throws IOException {
        assertEquals(37, TemperatureDifference.calculateDifference(12, 49));
        assertEquals(19, TemperatureDifference.calculateDifference(92, 73));
    }

//    @Test
//    void FindThePowerTest() throws IOException {
//        String[] args = null;
//        System.setIn(new FileInputStream("data_files/powers.txt"));
//        FindThePower.main(args);
//        assertTrue(outContent.toString().contains("5^3 = 125"));
//
//    }

//    @Test
//    void DistanceTests() {
//        assertEquals(7.211102550927978, Distance.distance(2, -3, -4, 1), 0.01);
//        assertEquals(10.0, Distance.distance(-4, -3, 4, 3), 0.1);
//    }


//    @Test
//    void RandomNumbersTest() {
//        boolean inCorrectRange = true;
//        for (int i=0; i<1000; i++) {
//            int num = RandomNumbers.getRandom();
//            if (num < 0 || num > 37) {
//                inCorrectRange = false;
//                break;
//            }
//        }
//        assertTrue(inCorrectRange);
//    }
}
