
public class Solution {
    public boolean isPowerOfTwo(int n) {
        int upper = 1;
        while (upper < n && upper > 0) {
            upper = upper << 1;
        }
        int lower = upper >>> 1;
        return n != 0 && (n == upper || n == lower);
    }
}
