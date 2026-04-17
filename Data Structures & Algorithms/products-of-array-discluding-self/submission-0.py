class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []
        for i in range(0,len(nums)):
            out = 1
            for j in range(0,len(nums)):
                if j == i:
                    continue
                else:
                    out *= nums[j]
            output.append(out)
        print(output)
        return output
        