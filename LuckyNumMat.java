import java.util.*;

class Solution {

    public void pr(int[] vl) {
        for (int i : vl) {
            System.out.print(i + " ");
        }
        System.err.println();
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] minListR = new int[m];
        int[] maxListC = new int[n];

        pr(minListR);
        pr(maxListC);

        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minListR[i] = min;
        }

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            maxListC[i] = max;
        }
        pr(minListR);
        pr(maxListC);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minListR[i] == maxListC[j]) {
                    list.add(minListR[i]);
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        List<Integer> list = new Solution().luckyNumbers(matrix);
        // System.out.println();
    }
}