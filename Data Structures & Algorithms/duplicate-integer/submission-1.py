class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        j = set()
        for i in nums:
            if i in j:
                return True
            else:
                j.add(i)
            print(j)

        return False
        