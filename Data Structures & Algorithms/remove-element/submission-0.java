class Solution {
    public int removeElement(int[] nums, int val) {
        int c = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
                c--;
            }
        }
        Arrays.sort(nums);

        return c;
    }
}