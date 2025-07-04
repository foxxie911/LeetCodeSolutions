class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        var countS = new HashMap<Character, Integer>();
        var countT = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}
