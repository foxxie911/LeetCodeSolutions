package org.foxxie911;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder mergedWord = new StringBuilder();
        int i = 0, j = 0;
        while(i < word1Length || j < word2Length){
            if(i < word1Length) {
                mergedWord.append(word1.charAt(i));
                i++;
            }
            if(j < word2Length) {
                mergedWord.append(word2.charAt(j));
            }
        }
        return mergedWord.toString();
    }
}
