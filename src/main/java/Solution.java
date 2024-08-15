class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fives++;
            }
            if (bills[i] == 10) {
                fives--;
                tens++;
            }
            if (bills[i] == 20) {
                if (tens > 0) {
                    tens--;
                    fives--;
                } else {
                    fives -= 3;
                }
            }
            if (tens < 0 || fives < 0) {
                return false;
            }
        }


        return true;
    }
}