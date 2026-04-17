class Solution:
    def isValid(self, s: str) -> bool:
        if len(s)<2:
            return False
        par_map = {
            ')':'(',
            ']':'[',
            '}':'{'
        }

        val = []
        for j in s:
            if j not in par_map:
                val.append(j)
            elif len(val) >= 1:
                ele = val.pop()
                if ele != par_map[j]:
                    return False
            else:
                return False
 
        if len(val) == 0:
            return True 
        else:
            return False
        