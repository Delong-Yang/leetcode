import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Delong on 15-6-25.
 */
public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();

        String input = "PAYPALISHIRING";
        int nRows = 3;
        String result = "PAHNAPLSIIGYIR";

        String anw = solution.convert(input, nRows);

        assertEquals("result should match", result, anw);

    }

    @Test
    public void test2() {
        Solution solution = new Solution();

        String input = "ABCDEFGHIJKLMN";
        int nRows = 4;
        String result = "AGMBFHLNCEIKDJ";

        String anw = solution.convert(input, nRows);

        assertEquals("result should match", result, anw);

    }
}
