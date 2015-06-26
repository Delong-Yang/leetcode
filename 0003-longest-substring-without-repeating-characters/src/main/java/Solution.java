import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int start = 0;
        int idx = 0;
        int curr_length = 0, max_length = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (idx <= s.length() - 1) {
            Character curr_char = s.charAt(idx);
            int prev_idx = -1;
            if (map.containsKey(curr_char)) {
                prev_idx = map.get(curr_char);
            }
            if (prev_idx < start) {

                curr_length++;
                if(curr_length > max_length) {
                    max_length = curr_length;
                }
            } else {
                start = prev_idx + 1;
                curr_length = idx - start + 1;

            }
            map.put(curr_char, idx);
            idx++;
        }
        return max_length;
    }
}
