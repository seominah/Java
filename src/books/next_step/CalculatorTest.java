package books.next_step;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 3));
        System.out.println(cal.subtract(7, 2));
        System.out.println(cal.multiply(2, 5));
        System.out.println(cal.divide(12, 3));
    }
}
