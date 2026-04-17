class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        maxLength = 1
        currLength = 1
        num = sorted(nums)
        print(num)
        if not nums:
            return 0
        for i in range(1,len(num)):
            if num[i]==num[i-1]+1:
                currLength += 1
                if maxLength <= currLength:
                    maxLength = currLength
            elif num[i]==num[i-1]:
                continue
            else:
                currLength = 1
            print(currLength)
        
        return maxLength


        