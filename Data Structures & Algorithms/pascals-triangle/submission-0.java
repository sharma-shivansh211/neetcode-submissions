class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();

        if (n == 0) return arr;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        arr.add(firstRow);

        for (int i = 1; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int t = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j);
                row.add(t);
            }

            row.add(1);
            arr.add(row);
        }

        return arr;
    }
}