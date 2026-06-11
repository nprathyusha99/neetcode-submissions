class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int res = binarySearch(nums, target, left, right); 
        return res;      
    }

    public int binarySearch(int[] nums, int target, int left, int right){
        
        while(left <= right){
            int mid = left + (right-left)/2;
            //System.out.println(left + " " + right+ " "+ mid);
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                return binarySearch(nums, target, mid+1, right);
            }
            if(target < nums[mid]){
                return binarySearch(nums, target, left, mid-1);
            }
        }
        return -1;
    }
}
