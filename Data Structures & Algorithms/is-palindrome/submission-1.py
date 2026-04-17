class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        s = "".join(char.lower() for char in s if char.isalnum())
        print(s)
        k = 0
        j = len(s) - 1
        while k < len(s)/2:
            if s[k].lower() != s[j].lower():
                return False
            k = k+1
            j = j-1

        return True
        