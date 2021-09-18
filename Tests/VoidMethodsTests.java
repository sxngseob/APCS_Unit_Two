import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoidMethodsTests {

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
}
