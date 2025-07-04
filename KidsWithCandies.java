package org.foxxie911;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int kidCount = candies.length;
        List<Boolean> result = new ArrayList<>(kidCount);
        int max = 0;
        for (int i = 0; i < kidCount; i++) {
            if (candies[i] > max) max = candies[i];
            candies[i] = candies[i] + extraCandies;
        }
        for (int candy : candies) {
            if (candy >= max) {
                result.add(true);
            } else result.add(false);
        }
        return result;
    }
}
