class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indexMap = dict()
        
        for index, value in enumerate(nums):
            indexMap[value] = index
            
        for index, value in enumerate(nums):
            complement = target - value
            if complement in indexMap and indexMap[complement] != index:
                return {index, indexMap[complement]}
