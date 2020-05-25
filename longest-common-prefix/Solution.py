from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        result = ""
        short = min(strs, key=len)
        # print (short)
        
        for i in range(len(short)):
            ch = strs[0][i]
            for s in strs:
                if s[i] != ch:
                    return strs[0][0:i]
                
        return short

if __name__ == "__main__":
    s = Solution()
    print(s.longestCommonPrefix([]))
    print(s.longestCommonPrefix(["aa", "aab", "ac"]))
