class Solution:
    def maxArea(self, h: List[int]) -> int:
        maxArea = 0
        left = 0
        right  = len(h)-1
        while left <right:
            currArea = min(h[left],h[right])*(right - left)
            if currArea>maxArea:
                maxArea = currArea
            # now change
            if h[left]<h[right]:
                left +=1
            elif h[left]>h[right]:
                right -= 1
            else:
                left += 1
                right -= 1
        
        return maxArea