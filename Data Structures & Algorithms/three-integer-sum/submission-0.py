class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()  # Essential step!

        for i in range(len(nums)):
            # Optimization: If the first number is > 0, no triplet can sum to 0
            if nums[i] > 0:
                break
            
            # Skip duplicates for the first element
            if i > 0 and nums[i] == nums[i-1]:
                continue

            l, r = i + 1, len(nums) - 1
            while l < r:
                three_sum = nums[i] + nums[l] + nums[r]
                if three_sum > 0:
                    r -= 1
                elif three_sum < 0:
                    l += 1
                else:
                    res.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    # Skip duplicates for the second and third elements
                    while nums[l] == nums[l-1] and l < r:
                        l += 1
        return res