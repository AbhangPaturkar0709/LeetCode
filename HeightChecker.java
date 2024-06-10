import java.util.Arrays;

class Solution {
    public void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int heightChecker(int[] heights) {
        print(heights);
        int[] arr = new int[heights.length];
        print(heights);
        print(arr);
        System.arraycopy(heights, 0, arr, 0, heights.length);
        print(heights);
        print(arr);
        Arrays.sort(heights);
        print(heights);
        print(arr);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i]) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = { 5, 1, 2, 3, 4 };
        System.out.println(obj.heightChecker(arr));
    }
}