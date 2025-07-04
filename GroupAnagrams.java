class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       var words = new HashMap<String, List<String>>();
       for(String s : strs) {
        int[] alphaBlue = new int[26];
        for(char c : s.toCharArray()){
            alphaBlue[c - 'a']++;
        }
        String key = Arrays.toString(alphaBlue);
        if(!words.containsKey(key)) words.put(key, new ArrayList<String>());
        words.get(key).add(s);
       } 
       return new ArrayList<>(words.values());
    }
}