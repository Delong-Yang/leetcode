import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        int result = 5;
        String input = "Hello world";

        Assert.assertEquals("last world length should be 5",
                result, solution.lengthOfLastWord(input));

    }

    @Test
    public void test2() {
        Solution solution = new Solution();

        int result = 5;
        String input = "world";

        Assert.assertEquals("last world length should be 5",
                result, solution.lengthOfLastWord(input));

    }

    @Test
    public void test3() {
        Solution solution = new Solution();

        int result = 0;
        String input = " ";

        Assert.assertEquals("last world length should be 0",
                result, solution.lengthOfLastWord(input));

    }
}
