class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dict1 = {}
        dict2 = {}
        if len(s) != len(t):
            return False
        for i in range(0,len(s)):
            dict1[s[i]] = 1 + dict1.get(s[i],0)
            dict2[t[i]] = 1 + dict2.get(t[i],0)
        print(f"dict1: {dict1}  dict2:{dict2}")

        return dict1 == dict2
        