class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equalsIgnoreCase("++X")) {
                ++x;
            }
            if (operation.equalsIgnoreCase("--X")) {
                --x;
            }
            if (operation.equalsIgnoreCase("X++")) {
                x++;
            }
            if (operation.equalsIgnoreCase("X--")) {
                x--;
            }
        }
        return x;
    }
}