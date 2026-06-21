class Solution {
    public int removeElement(int[] nums, int val) {
        int c = nums.length;
        for (int l = 0, r = nums.length - 1; l <= r;) {
            if (nums[l] == val) {
                if (nums[r] != val) {
                    nums[l++] = nums[r];
                    nums[r--] = val;
                    c--;
                }else {
                    r--;
                    c--;
                    continue;
                }
            }else{
                l++;
            }
        }
        return c;
    }
}