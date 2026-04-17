import operator
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqMap = {} # val: freq
        for num in nums:
            freqMap[num] = 1+freqMap.get(num,0)
        print(freqMap)
        sorted_dict = sorted(freqMap.items(), key=operator.itemgetter(1), reverse=True)
        iti = 0
        ans = []
        for i in sorted_dict:
            iti =iti+1
            ans.append(i[0])
            if iti == k:
                break 
            
        return ans

        