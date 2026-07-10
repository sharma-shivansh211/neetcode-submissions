class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] soln = new int[m+n];
        int i,j,k;
        for(i = 0, j = 0,k=0 ; k < m+n ;){
            if(i < m && j < n){
                if(nums1[i] < nums2[j]){
                    soln[k++] = nums1[i++];
                }else{
                    soln[k++] = nums2[j++];
                }
            }else if(i < m){
                soln[k++] = nums1[i++];
            }else{
                soln[k++] = nums2[j++];
            }
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = soln[x];
        }
    }
}