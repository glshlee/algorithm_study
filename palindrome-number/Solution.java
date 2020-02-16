class Solution {
    public boolean isPalindrome(int x) {
        int revertNum = 0;
        if (x < 0 || (x!=0 && x%10==0)) {
            return false;
        }
        
        // int num = x;
        while (revertNum < x) {
            revertNum = (revertNum * 10) + (x % 10);
            x = x/10;
            // System.out.println("revert: " + revertNum + " x: " + x);
        }
        
        if (x == revertNum || x == revertNum/10) {
            return true;
        }
        
        return false;
    }
}