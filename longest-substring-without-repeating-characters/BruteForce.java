class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = null;
        int result = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (s.length() - i < result) {
                break;
            }
            
            set = new HashSet<>();
            for (int j=i; j<s.length(); j++) {
                // System.out.println("i: " + i + " j: " + j + " char: " + s.charAt(j) + " result: " + result);
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    if (result < j-i+1) {
                        result = j-i+1;
                    }
                } else {
                    break;
                }
            }
        }
        
        return result;
    }
}
