class Solution:
    def maxArea(self, h: List[int]) -> int:
        valmax = 0

        for i in range(len(h)):
            for j in range(i+1,len(h)):
                valcurr = 0
                height = min(h[i],h[j])
                valcurr = height*(j-i)
                if valmax<valcurr:
                    valmax = valcurr
        
        return valmax
        