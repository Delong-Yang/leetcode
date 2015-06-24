import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
            map.put(numbers[i], i+1);
        }

        for (int i=0; i < numbers.length; i++) {
            int val = target-numbers[i];
            if (map.containsKey(val) && map.get(val) != i+1) {
                int[] ret = new int[2];
                ret[0]=i+1;
                ret[1] = map.get(val);
                return ret;
            }
        }
        return null;

    }
}