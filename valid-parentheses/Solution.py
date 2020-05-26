class Solution:
    def isValid(self, s: str) -> bool:
        brackets = {"(":")", "[":"]", "{":"}"}
        stack = []
        
        for c in s:
            if c in brackets.keys():
                stack.append(c)
            elif stack and c == brackets[stack[-1]]:
                stack.pop()
            else:
                return False
                    
        return stack == []

if __name__ == "__main__":
    s = Solution()
    print(s.isValid("(){}"))
    print(s.isValid("()){}"))
    print(s.isValid(""))
    print(s.isValid("(){}[{}]"))
