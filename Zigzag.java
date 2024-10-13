class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int n = s.length();
        char[][] arr = new char[numRows][n];    
        int isDown = 1;
        int i = 0, j = 0, k = 0;
        while (k < n) {
            arr[i][j] = s.charAt(k++);
            
            if (isDown == 1) {
                i++;
            } else {
                i--;
                j++;
            }
            
            if (i == numRows) {
                isDown = -1;
                i -= 2;
                j++;
            } else if (i < 0) { 
                isDown = 1;
                i += 2;
                j--;
            }
        }
        s = "";
        for (i = 0; i < numRows; i++) {
            for (j = 0; j < n; j++) {
                if (arr[i][j] != 0)
                    s += arr[i][j];
            }
        }
        return s;
    }
}