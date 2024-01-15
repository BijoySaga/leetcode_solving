class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        for val in set(s):
            if s.count(val) != t.count(val):
                return False
        return True#bijoysaga  