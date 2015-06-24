import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        String version1 = "1.0";
        String version2 = "0.1";

        int result = 1;

        assertEquals("version1 large than version2",
                result,
                solution.compareVersion(version1, version2));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();

        String version1 = "1.0.1";
        String version2 = "1.12";

        int result = -1;

        assertEquals("version1 less than version2",
                result,
                solution.compareVersion(version1, version2));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();

        String version1 = "1.0.1";
        String version2 = "1.0.1";

        int result = 0;

        assertEquals("version1 equals version2",
                result,
                solution.compareVersion(version1, version2));
    }

    @Test
    public void test4() {
        Solution solution = new Solution();

        String version1 = "1.0";
        String version2 = "1";

        int result = 0;

        assertEquals("version1 equals version2",
                result,
                solution.compareVersion(version1, version2));
    }
}
