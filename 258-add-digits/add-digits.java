class Solution {
    public int ans(int num){
        if(num <10)
            return num;
        int val = 0;
        while(num != 0){
            val+=num%10;
            num/=10;
        }
        return ans(val);
    }
    public int addDigits(int num) {
        return ans(num);
        
    }
}