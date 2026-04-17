class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_map = {}
        for ele in s1:
            s1_map[ele] = 1 + s1_map.get(ele,0)
        s2_map = {}
        left = 0
        window_size = len(s1)

        for right in range(len(s2)):
            # add char to window
            s2_map[s2[right]] = 1 + s2_map.get(s2[right], 0)

            # keep window size fixed
            if right - left + 1 > window_size:
                s2_map[s2[left]] -= 1
                if s2_map[s2[left]] == 0:
                    del s2_map[s2[left]]
                left += 1

            # compare only when window size matches
            if right - left + 1 == window_size:
                if s1_map == s2_map:
                    return True
        return False
            
