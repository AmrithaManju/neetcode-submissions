class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
       
        int sl=0;
        int tl=0;
        int l;
        for(int i=0;i<n;i++)
        {
         l=Math.max(sl,nums[i]+tl);
         
         tl=sl;
         sl=l;
        
        }
        return sl;
    }
}
