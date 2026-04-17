class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        heep = {}
        left = 0
        ma = 0

        for right in range(len(s)):
            # shrink window until duplicate is removed
            while s[right] in heep:
                del heep[s[left]]
                left += 1

            heep[s[right]] = 1
            ma = max(ma, len(heep))
        return ma
        