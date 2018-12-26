class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int [] top = new int[grid[0].length];
        int [] left = new int[grid.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = max(grid[i]);
        }

        for (int j = 0; j < top.length; j++) {
            top[j] = max(grid, j);
        }
        int sum = 0;

        for (int i=0;i<grid.length;i++) {
            for (int j = 0; j< grid[0].length; j++) {
                int cap = left[i] < top[j] ? left[i] : top[j];
                sum += cap - grid[i][j];
            }
        }

        return sum;
    }

    private int max(int[][] grid, int j) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < grid.length; i++) {
            if (grid[i][j] > max) {
                max = grid[i][j];
            }
        }
        return max;
    }

    private int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}