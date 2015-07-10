import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> rawSet = new HashSet<>();
        Set<Integer> encoded = new HashSet<>();

        for (int i = 0; i < s.length() - 9; i++) {
            int sum = 0;

            for (int j = 0; j < 10; j++) {
                switch (s.charAt(i + j)) {
                    case 'A':
                        sum = 4 * sum;
                        break;
                    case 'C':
                        sum = 4 * sum + 1;
                        break;
                    case 'G':
                        sum = 4 * sum + 2;
                        break;
                    case 'T':
                        sum = 4 * sum + 3;
                }
            }

            if (!encoded.contains(sum)) {
                encoded.add(sum);
            } else {
                rawSet.add(s.substring(i, i + 10));
            }
        }
        return new ArrayList<>(rawSet);
    }

}
