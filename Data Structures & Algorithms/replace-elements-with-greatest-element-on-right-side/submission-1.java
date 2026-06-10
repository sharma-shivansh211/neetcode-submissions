class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0 ; i < arr.length-1 ; i++){
            int max = i+1;
            for(int j = i+2 ; j < arr.length ; j++){
                if(arr[max] < arr[j]) max = j;
            }
            arr[i] = arr[max];
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}