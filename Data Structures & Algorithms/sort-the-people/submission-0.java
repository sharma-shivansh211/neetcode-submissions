class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] result = new String[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            int maxIdx = -1;

            for (int j = 0; j < n; j++) {
                if (!used[j] && (maxIdx == -1 || heights[j] > heights[maxIdx])) {
                    maxIdx = j;
                }
            }

            result[i] = names[maxIdx];
            used[maxIdx] = true;
        }

        return result;
    }
}