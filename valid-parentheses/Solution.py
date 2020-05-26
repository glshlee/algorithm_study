class Solution:
    def isValid(self, s: str) -> bool:
        brackets = {"(":")", ")":"(", "[":"]", "]":"[", "{":"}", "}":"{"}
        stack = []
        top = -1
        for c in s:
            if top < 0:
                stack.append(c)
                top += 1
            else:
                if stack[top] != brackets[c]:
                    stack.append(c)
                    top += 1
                else:
                    stack.pop()
                    top -= 1
        
        if top == -1:
            return True 

        return False

if __name__ == "__main__":
    s = Solution()
    print(s.isValid("(){}"))
    print(s.isValid("()){}"))
    print(s.isValid(""))
    print(s.isValid("(){}[{}]"))
