public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();

        for (int i = 0; i < pairs.size(); i++) {
            Pair a = pairs.get(i);
            int in = i;

            while (in > 0 && pairs.get(in - 1).key > a.key) {
                pairs.set(in, pairs.get(in - 1));
                in--;
            }

            pairs.set(in, a);

            result.add(new ArrayList<>(pairs));
        }

        return result;
    }
}