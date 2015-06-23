public class Solution {
    public int compareVersion(String version1, String version2) {
        String DOT = ".";
        if (version1.startsWith(DOT)) version1 = 0 + version1;
        if (version2.startsWith(DOT)) version2 = 0 + version2;

        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int n = arr1.length > arr2.length
                ? arr1.length
                : arr2.length;

        for (int i = 0; i < n; i++) {
            int v1, v2;
            if (i < arr1.length) v1 = Integer.parseInt(arr1[i]);
            else v1 = 0;

            if (i < arr2.length) v2 = Integer.parseInt(arr2[i]);
            else v2 = 0;

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }

        return 0;

    }
}