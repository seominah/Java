package books.next_step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal = new Calculator();

    @Test
    void add() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void subtract() {
        assertEquals(3, cal.subtract(6,3));
    }

    @Test
    void multiply() {
        assertEquals(10, cal.multiply(2, 5));
    }

    @Test
    void divide() {
        assertEquals(4, cal.divide(12, 3));
    }
}