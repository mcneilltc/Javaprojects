import  org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class BearTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @org.junit.Test
    public void eat() {
        Bear griz1 = new Bear();
        Bear.eat();
        assertEquals(outContent.toString(), "Bears eat fish...\n");
    }


    @org.junit.Test
    public void move() {
        Bear griz1 = new Bear();
        Bear.move();
        assertEquals(outContent.toString(), "I charge\n");
    }
    @org.junit.Test
    public void sleep() {
        Bear griz1 = new Bear();
        Bear.sleep();
        assertEquals(outContent.toString(), "I sleep in a cave\n");
    }
}