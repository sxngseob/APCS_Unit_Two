import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Unit2_2Tests {
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
    void PointsAndRectanglesTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data_files/pandr.txt"));
        PointsAndRectangles.main(args);
        assertTrue(outContent.toString().contains("java.awt.Point[x=7,y=3]\njava.awt.Dimension[width=6,height=2]\njava.awt.Rectangle[x=7,y=3,width=6,height=2]"),
                "Did you use the correct arguments?");

    }
}
