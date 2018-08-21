import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {

    @Test
    public void testIndexWith1() {
        int index = 1;
        int expected = 1;

        int result = Fibonacci.findValue(index);
        assertEquals(expected, result);
    }

    @Test
    public void testIndexWith2() {
        int index = 2;
        int expected = 1;

        int result = Fibonacci.findValue(index);
        assertEquals(expected, result);
    }

    @Test
    public void testIndexWith3() {
        int index = 3;
        int expected = 2;

        int result = Fibonacci.findValue(index);
        assertEquals(expected, result);
    }
}