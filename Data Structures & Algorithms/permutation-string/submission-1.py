class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_sort = "".join(sorted(s1))
        for ele in range(len(s2)):
            if s2[ele] in  s1:
                #loop through the elements of s2 until the size of s1 is reached
                s2_sort = "".join(sorted(s2[ele:ele+len(s1)]))
                if s1_sort == s2_sort:
                    return True

        return False
        