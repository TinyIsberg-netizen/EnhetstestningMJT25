package iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    public int a;
    public int b;
    int count;
    public double c;
    public double d;

    @Test
    void testAddOnePlusTwoEqualsThree() {
        // Calculator cal = new Calculator();

        assertEquals(3, Calculator.add(1, 2));

    }

    @Test
    void testDivideTenWithTwoEqualsFive() {
        // Calculator calTest = new Calculator();
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test

    void testDivisionByZeroEqualsFalse() {

        IllegalArgumentException ex = assertThrowsExactly(IllegalArgumentException.class,
                () -> Calculator.divide(5, 0));
        assertEquals("Division by zero is not allowed", ex.getMessage());
    }

}
