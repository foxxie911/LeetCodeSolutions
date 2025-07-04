package org.foxxie911;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int effectiveLength = gcd(str1Length, str2Length);
        if(str1.concat(str2).equals(str2.concat(str1))) return str1.substring(0, effectiveLength);
        return "";
    }

    private int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
