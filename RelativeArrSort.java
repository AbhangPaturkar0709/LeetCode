class Solution {
    public void print(int[] ar) {
        for (int i : ar) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] countArr = new int[1001];
        for (int i : arr1) {
            countArr[i]++;
        }
        int[] res = new int[arr1.length];
        int k = 0;
        for (int i : arr2) {
            int count = countArr[i];
            for (int j = 1; j <= count; j++) {
                res[k] = i;
                countArr[i]--;
                k++;
            }
        }

        for(int i = 0; i < countArr.length;i++){
            if(countArr[i]>0){
                int count = countArr[i];
                for(int j = 1; j <= count; j++){
                    res[k] = i;
                    countArr[i]--;
                    k++;
                }
            }
        }
 
        // print(countArr);
        // print(res);

        return res;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int ar1[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int ar2[] = { 2, 1, 4, 3, 9, 6 };
        obj.relativeSortArray(ar1, ar2);
    }
}