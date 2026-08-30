class Solution {
    public int minimumDeletions(int[] nums) {
        int maxi=nums[0];
        int mini=nums[0];
        int minpos=0;
        int maxpos=0;
        int mid=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
                maxpos=i;
            }
            if(nums[i]<mini){
                mini=nums[i];
                minpos=i;
            }
        }
        int left=Math.max(minpos,maxpos)+1;
        int right=nums.length-Math.min(minpos,maxpos);
        int both=Math.min(minpos,maxpos)+1+nums.length-Math.max(minpos,maxpos);
        
        return Math.min(left,Math.min(right,both));
        
}
}