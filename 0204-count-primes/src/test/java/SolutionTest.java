import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int input = 10;
        int result = 4;

        assertEquals("4 prime numbers less than 10",
                result, solution.countPrimes(input));

    }

    @Test
    public void test2() {
        Solution solution = new Solution();

        int input = 11;
        int result = 4;

        assertEquals("4 prime numbers less than 11",
                result, solution.countPrimes(input));

    }

    @Test
    public void test3() {
        Solution solution = new Solution();

        int input = 2;
        int result = 0;

        assertEquals("1 prime numbers less than 2",
                result, solution.countPrimes(input));

    }
}
