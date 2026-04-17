class Solution:
    def search(self, n: List[int], target: int) -> int:
        left = 0
        right  =  len(n)-1
        while left <= right:
            mid = left  + (right -left) // 2
            print(mid)
            if target == n[mid]:
                return mid
            if target < n[mid]:
                right  = mid -1
            elif target > n[mid]:
                left  = mid +1

        return -1
        