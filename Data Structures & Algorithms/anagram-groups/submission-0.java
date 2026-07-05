class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            int[] freq = new int[26];
            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int count : freq) {
                key.append(count).append("#");
            }
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
