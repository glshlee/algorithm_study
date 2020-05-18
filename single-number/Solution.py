from typing import List

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        numList = []
        for num in nums:
            if num in numList:
                numList.remove(num)
            else:
                numList.append(num)
        return numList.pop()

if __name__ == "__main__":
    s = Solution()
    print(s.singleNumber([1, 1, 2]))
