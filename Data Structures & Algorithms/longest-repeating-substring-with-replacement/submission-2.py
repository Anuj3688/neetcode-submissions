class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxLen = 0
        freq = {}
        left = 0
        maxFreq = 0
        for right in range(len(s)):
            freq[s[right]] = 1 + freq.get(s[right],0)

            maxFreq = max(maxFreq, freq[s[right]])
            if (right - left + 1) - maxFreq > k:
                # shrink window
                freq[s[left]] -= 1
                left += 1

            # update answer
            maxLen = max(maxLen, right - left + 1)



        return maxLen
