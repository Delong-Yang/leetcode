import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;

        List<Integer>[] lists = new List[numRows];

        for (int i = 0; i < numRows; i++) {
            lists[i] = new ArrayList<Integer>();
        }

        int incremental = 1;
        int row = 0;
        for (int i = 0; i < s.length(); i++) {
            lists[row].add(i);
            row += incremental;

            if (row == numRows-1 || row == 0) {
                incremental *= -1;
            }
        }
        StringBuffer buffer = new StringBuffer();
        for (List<Integer> list : lists) {
            for (Integer i : list) {
                buffer.append(s.charAt(i));
            }
        }
        return buffer.toString();
    }
}