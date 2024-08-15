class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] != 5) return false;

        int fiveBill = 0;
        int tenBill = 0;
        // int twentyBill = 0;

        for(int i : bills){
            if(i == 5){
                fiveBill++;
            }
            if(i == 10){
                if(fiveBill > 0){
                    fiveBill--;
                    tenBill++;
                }else{
                    return false;
                }
            }
            if(i == 20){
                if(fiveBill > 0 && tenBill > 0){
                    fiveBill--;
                    tenBill--;
                }else if(fiveBill > 2){
                    fiveBill -= 3;
                }else{
                    return false;
                }
                // if((tenBill / 5) > 0 && (fiveBill / 5) > 0){
                    // twentyBill -= 15;
                // }else{
                //     return false;
                // }
                // tenBill -= 10;
                // fiveBill -= 5;
            }
        }
        return true;
        // return (fiveBill + tenBill + twentyBill) == (5 * bills.length);
    }
}