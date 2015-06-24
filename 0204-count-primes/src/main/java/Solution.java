public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrimes[i] = true;
        }

        for (int i = 2; i < n; i++) {
            int cur = i;
            while (cur + i < n) {
                cur = cur + i;
                isPrimes[cur] = false;
            }
        }

        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimes[i]) ret++;
        }
        return ret;

    }
}