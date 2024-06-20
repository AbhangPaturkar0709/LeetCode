import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDNum = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (String.valueOf(i).indexOf('0') < 0) {
                boolean flag = true;
                int temp = i;
                innerLoop: while (temp > 0) {
                    int digit = temp % 10;
                    if (i % digit != 0) {
                        flag = false;
                        break innerLoop;
                    }
                    temp /= 10;
                }

                if (flag == true) {
                    selfDNum.add(i);
                }
            }
        }
        return selfDNum;
    }
}