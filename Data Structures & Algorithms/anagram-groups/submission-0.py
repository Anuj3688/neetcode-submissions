class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        new = defaultdict(list) # key  = counts value is element[]
        for i in strs:
            j = "".join(sorted(i))
            print(j)
            new[j].append(i)
            
        return list(new.values())
        