public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int numsLength = nums.Length;
        var result = new int[numsLength];
        var prefix = new int[numsLength];
        var suffix = new int[numsLength];

        prefix[0] = 1;
        suffix[numsLength - 1] = 1;

        for(int i = 1; i < numsLength; i++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        for(int i = numsLength - 2; i >= 0; i--){
            suffix[i] = nums[i + 1] * suffix[i + 1];
        }

        for(int i = 0; i < numsLength; i++){
            result[i] = prefix[i] * suffix[i];
        }
        
        return result;
    }
}
