class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> n=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int required=target-nums[i];
            if(n.containsKey(required)){
                return new int[]{n.get(required),i};
            }
            n.put(nums[i],i);

        }
        return new int[]{};
    }
}