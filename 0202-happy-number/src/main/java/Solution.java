import java.util.*;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                return false;
            }
            n = next(n);
        }
        return true;

    }
    private List<Integer> split(int n) {
        List<Integer> rt = new ArrayList<>();
        while (n != 0) {
            int a = n % 10;
            rt.add(a);
            n = n / 10;
        }
        return rt;
    }
    private int next(int n) {
        List<Integer> digits = split(n);
        int next = 0;
        for (Integer i : digits) {
            next += i * i;
        }
        return next;
    }
}
