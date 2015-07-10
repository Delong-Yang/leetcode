public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff = new int[gas.length];

        for (int i = 0; i < gas.length; i++) {
            diff[i] = gas[i] - cost[i];
        }

        for (int i = 0; i < gas.length; i++) {
            int sum = 0;
            int j = i;
            boolean canComplete = true;
            for (int k = 0; k < gas.length; k++) {
                sum += diff[j];
                if (sum < 0) {
                    canComplete = false;
                    break;
                }
                j++;
                if (j == gas.length) j = 0;
            }
            if (canComplete) return i;
        }

        return -1;
    }
}
