import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] anw = solution.twoSum(numbers, target);
        assertEquals("first number index is 1", 1, anw[0]);
        assertEquals("second number index is 2", 2, anw[1]);
    }
}
