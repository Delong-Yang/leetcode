import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rt = new ArrayList<List<Integer>>();
        if (numRows < 1) return rt;

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        rt.add(list);

        for (int i = 1; i < numRows; i++) {
            List<Integer> last = rt.get(i-1);
            int size = i + 1;
            Integer[] nums = new Integer[size];
            int mid = size / 2;
            nums[0] = 1;
            for (int j = 1; j <= mid && i > 1; j++) {
                nums[j] = last.get(j-1) + last.get(j);
            }
            for (int a = 0, b = size - 1; a < b; a++, b--) {
                nums[b] = nums[a];
            }
            rt.add(Arrays.asList(nums));
        }
        return rt;
    }
}