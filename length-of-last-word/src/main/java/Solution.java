public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        String SPACE = " ";
        int index = s.lastIndexOf(SPACE);

        return s.length() - index - 1;
    }
}