import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() {
        assertEquals(5, new Calculator().add(2 ,3));
    }

}