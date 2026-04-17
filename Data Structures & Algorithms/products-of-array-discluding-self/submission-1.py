class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefix  = 1
        suffix = 1
        res = [1]*n
        print("Current res:",res)

        for i in range(n):
            res[i] = prefix
            prefix *= nums[i]
        print("prefix:",res)

        for i in range(n - 1, -1, -1):
            res[i] *= suffix
            suffix *= nums[i]
        
        return res

