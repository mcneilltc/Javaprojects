import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TurtleTest {

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

    @Test
    public void eat() {
        Turtle turbo = new Turtle();
        Turtle.eat();
        assertEquals(outContent.toString(), "Turtles eat fish...\n");
    }

    @Test
    public void sleep() {
        Turtle turbo = new Turtle();
        Turtle.sleep();
        assertEquals(outContent.toString(), "I sleep in my shell\n");
    }

    @Test
    public void move() {
        Turtle turbo = new Turtle();
        Turtle.move();
        assertEquals(outContent.toString(), "I walk slow\n");
    }
}