import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsParametersTests {

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
    void FourRectanglePrinterTest() {
        String expect = "java.awt.Rectangle[x=5,y=3,width=7,height=13]\n" +
                "java.awt.Rectangle[x=12,y=3,width=7,height=13]\n" +
                "java.awt.Rectangle[x=12,y=16,width=7,height=13]\n" +
                "java.awt.Rectangle[x=5,y=16,width=7,height=13]\n";
        FourRectanglePrinter.main(null);
        assertEquals(expect, outContent.toString());
    }

    @Test
    void GrowSquarePrinterTest() {
        String expect = "java.awt.Rectangle[x=100,y=100,width=50,height=50]\n" +
                "java.awt.Rectangle[x=100,y=100,width=100,height=100]\n";
        GrowSquarePrinter.main(null);
        assertEquals(expect, outContent.toString());
    }
}
