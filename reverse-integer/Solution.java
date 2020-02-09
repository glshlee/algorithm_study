class Solution {
    public int reverse(int x) {
//         int sign = 1;
//         if (x < 0) {
//             x *= -1;
//             sign = -1;
//         }
        
//         StringBuffer sb = new StringBuffer();
//         sb.append(x);
        
//         int result = 0;
//         try {
//             String reverse = sb.reverse().toString();
//             System.out.println(reverse);
//             result = Integer.parseInt(reverse) * sign;
//         } catch (Exception e) {
//             result = 0;
//         }
        
//         return result;
        
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
