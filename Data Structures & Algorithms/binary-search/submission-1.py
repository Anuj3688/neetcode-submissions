class Solution:
    def search(self, n: List[int], target: int) -> int:
        left = 0
        right  =  len(n)-1
        while left <= right:
            mid = left  + (right -left) // 2
            
            if target < n[mid]:
                right  = mid -1
            elif target > n[mid]:
                left  = mid +1
            if target == n[mid]:
                return mid

        return -1
        