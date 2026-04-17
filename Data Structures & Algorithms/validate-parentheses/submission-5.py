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
            else:
                if not val or val.pop() != par_map[j]:
                    return False
 
        return len(val) == 0
        