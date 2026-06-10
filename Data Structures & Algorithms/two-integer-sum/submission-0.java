class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                int one = Math.min(map.get(target-nums[i]),i);
                int two = Math.max(map.get(target-nums[i]),i);
                return new int[]{one,two};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
