class Solution {
public:
    bool isPowerOfTwo(int n) {

        if (n == 0)    return false;
        for (ulong value1 = 1; value1 > 0; value1 = value1 << 1)
        {
            if (value1 == n)    return true;
            if (value1 > n)     return false;
        }
        return false;
        
    }
};