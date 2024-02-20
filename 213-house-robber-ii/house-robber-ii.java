class Solution {
    public int rob(int[] nums) {
        int ind=nums.length-1;
        HashMap<Pair,Integer> map=new HashMap<>();
        if(ind==0)
        return nums[0];
        else
        return Math.max(f(ind-1,nums,0,map),f(ind,nums,nums[ind],map)); 
    }
    public static int f(int i,int nums[],int curr,HashMap<Pair,Integer> map){
        Pair key=new Pair(i,curr);
           if(map.containsKey(key))
        return map.get(key);
        if(i<0)//0
        return 0;
        if(i==0){
            if(curr==0)
            return nums[0];
            else
            return 0;
        }
          int take=f(i-2,nums,curr,map)+nums[i];
          int nottake=f(i-1,nums,curr,map);
          map.put(key,Math.max(take,nottake));
          return Math.max(take,nottake);

    }
}