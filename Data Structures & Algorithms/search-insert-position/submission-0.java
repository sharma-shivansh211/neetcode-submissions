class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid;
        int si = 0;
        int ei = nums.length-1;
        while(ei >= si){
            mid = si +(ei - si)/2;
            if(nums[mid] < target) si = mid+1;
            if(nums[mid] > target) ei = mid-1;
            if(nums[mid] == target) return mid;
        }
        return si ;
    }
}