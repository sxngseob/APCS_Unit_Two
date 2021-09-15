import org.junit.jupiter.api.*;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UnitTwoTests {

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
    @Order(1)
    void PointsAndRectanglesTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/pandr.txt"));
        PointsAndRectangles.main(args);
        assertTrue(outContent.toString().contains("java.awt.Point[x=7,y=3]\njava.awt.Dimension[width=6,height=2]\njava.awt.Rectangle[x=7,y=3,width=6,height=2]"),
                "Did you use the correct arguments?");

    }

    @Test
    @Order(2)
    void FightSongTest() {
        String[] args = null;
        String expect = "Go, team, go!\n" +
                "You can do it.\n\n" +
                "Go, team, go!\n" +
                "You can do it.\n" +
                "You're the best,\n" +
                "In the West.\n" +
                "Go, team, go!\n" +
                "You can do it.\n\n" +
                "Go, team, go!\n" +
                "You can do it.\n" +
                "You're the best,\n" +
                "In the West.\n" +
                "Go, team, go!\n" +
                "You can do it.\n\n" +
                "Go, team, go!\n" +
                "You can do it.\n";
                FightSong.main(args);
        assertEquals(expect, outContent.toString(), "Check your spelling, punctuation and blank lines");
    }

    @Test
    @Order(4)
    void FourRectanglePrinterTest() {
        String[] args = null;
        String expect = "java.awt.Rectangle[x=5,y=3,width=7,height=13]\n" +
                "java.awt.Rectangle[x=12,y=3,width=7,height=13]\n" +
                "java.awt.Rectangle[x=12,y=16,width=7,height=13]\n" +
                "java.awt.Rectangle[x=5,y=16,width=7,height=13]\n";
        FourRectanglePrinter.main(args);
        assertEquals(expect, outContent.toString());
    }

    @Test
    @Order(5)
    void GrowSquarePrinterTest() {
        String[] args = null;
        String expect = "java.awt.Rectangle[x=100,y=100,width=50,height=50]\n" +
                "java.awt.Rectangle[x=100,y=100,width=100,height=100]\n";
        GrowSquarePrinter.main(args);
        assertEquals(expect, outContent.toString());
    }

    @Test
    @Order(6)
    void RectangleFunTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/rectangle.txt"));
        RectangleFun.main(args);
        assertTrue(outContent.toString().contains("Perimeter = 30.0\nNew location is (-9.0, 5.0)"));
    }

    @Test
    @Order(7)
    void NamesTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/names.txt"));
        Names.main(args);
        assertTrue(outContent.toString().contains("Katherine Johnson\n16\nKJ\n1\n-1\n7\nKathnson Joherine"),
                "Did you use the correct arguments?");

    }




//    @Test
//    @Order(11)
//    void WrappersDelightTest() {
//        String[] args = null;
//        WrappersDelight.main(args);
//        String expected = "15\n5\n29.5\n10.5\n";
//        assertTrue(outContent.toString().contains(expected));
//    }

    @Test
    @Order(12)
    void TemperatureDifferenceTest() throws IOException {
        assertEquals(37, TemperatureDifference.calculateDifference(12, 49));
        assertEquals(19, TemperatureDifference.calculateDifference(92, 73));
    }

//    @Test
//    @Order(13)
//    void FindThePowerTest() throws IOException {
//        String[] args = null;
//        System.setIn(new FileInputStream("data_files/powers.txt"));
//        FindThePower.main(args);
//        assertTrue(outContent.toString().contains("5^3 = 125"));
//
//    }

//    @Test
//    @Order(14)
//    void DistanceTests() {
//        assertEquals(7.211102550927978, Distance.distance(2, -3, -4, 1), 0.01);
//        assertEquals(10.0, Distance.distance(-4, -3, 4, 3), 0.1);
//    }


//    @Test
//    @Order(16)
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

//    @Test
//    @Order(17)
//    void SquareWordRootTest() throws IOException {
//        String[] args = null;
//        System.setIn(new FileInputStream("data_files/words.txt"));
//        SquareWordRoot.main(args);
//        assertTrue(outContent.toString().contains("The \"square root\" of arachnophobia is h");
//
//    }
}
