package org.foxxie911.ReverseInteger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void reverseInteger123(){
        var solution = new Solution();
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    void reverseInteger123two(){
        var solution = new Solution();
        assertEquals(321, solution.reverse(123));
    }

    @Test
    void reverseInteger1534236469(){
        var solution = new Solution();
        assertEquals(0, solution.reverse(1534236469));
    }

    @Test
    void reverseInteger2147483412(){
        var solution = new Solution();
        assertEquals(-2143847412, solution.reverse(-2147483412));
    }
}
