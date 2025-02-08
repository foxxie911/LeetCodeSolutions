package org.foxxie911.ReverseInteger;

class Solution{

    public Solution(){}

    public int reverse(Integer x) {
        int reversedX = 0;
        while (x != 0) {
            if((reversedX > Integer.MAX_VALUE/10) || (reversedX < Integer.MIN_VALUE/10)) return 0;
            int digit = x % 10;
            x = x / 10;
            reversedX = (reversedX * 10) + digit;
        }
        return reversedX;
    }
}