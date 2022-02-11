package books.next_step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 3));
    }

    @Test
    void subtract() {
        Calculator cal = new Calculator();
        System.out.println(cal.subtract(10, 4));
    }

    @Test
    void multiply() {
        Calculator cal = new Calculator();
        System.out.println(cal.multiply(2, 5));
    }

    @Test
    void divide() {
        Calculator cal = new Calculator();
        System.out.println(cal.multiply(12, 3));
    }
}