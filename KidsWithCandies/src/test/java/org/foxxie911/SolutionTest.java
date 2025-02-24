package org.foxxie911;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    void solutionTest1(){
        Solution sl = new Solution();
        List<Boolean> expectedList = Arrays.asList(true, true, true, false, true);
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> resultList = sl.kidsWithCandies(candies, extraCandies);
        assertThat(resultList).isEqualTo(expectedList);
    }

    @Test
    void solutionTest2(){
        Solution sl = new Solution();
        List<Boolean> expectedList = Arrays.asList(true, false, false, false, false);
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> resultList = sl.kidsWithCandies(candies, extraCandies);
        assertThat(resultList).isEqualTo(expectedList);
    }

    @Test
    void solutionTest3(){
        Solution sl = new Solution();
        List<Boolean> expectedList = Arrays.asList(true, false, true);
        int[] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> resultList = sl.kidsWithCandies(candies, extraCandies);
        assertThat(resultList).isEqualTo(expectedList);
    }
}