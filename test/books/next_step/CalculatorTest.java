package books.next_step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator cal = new Calculator();
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void subtract() {
        Calculator cal = new Calculator();
        assertEquals(3, cal.subtract(6,3));
    }

    @Test
    void multiply() {
        Calculator cal = new Calculator();
        assertEquals(10, cal.multiply(2, 5));
    }

    @Test
    void divide() {
        Calculator cal = new Calculator();
        assertEquals(4, cal.divide(12, 3));
    }
}