package iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test

    void testAddOnePlusTwoEqualsThree() {
        Calculator cal = new Calculator();

        assertEquals(3, cal.add(1, 2));
    }

}
