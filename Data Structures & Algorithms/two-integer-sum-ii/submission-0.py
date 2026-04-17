class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        n = 0
        j = len(nums)-1
        while n < len(nums):
            if nums[n]+nums[j]==target:
                return [n+1,j+1]
            if nums[n]+nums[j]>target:
                 j = j-1
            else:
                 n = n +1