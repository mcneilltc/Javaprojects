import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void main() {
    }

    @org.junit.Test
    public void add() {
       assertEquals(20, Calculator.add(14,6));//when using double add a 0 for the delta
    }

    @Test
    public void subtract() {
        assertEquals(10, Calculator.Subtract(55,45));
    }

    @Test
    public void multiply() {
        assertEquals(20, Calculator.Multiply(5, 4));
    }

    @Test
    public void divide() {
        assertEquals(15, Calculator.Divide(30, 2));
    }
}