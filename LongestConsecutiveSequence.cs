public class Solution {
    public int LongestConsecutive(int[] nums) {
       var numSet = new HashSet<int>();
       foreach(int num in nums){
        numSet.Add(num);
       }
       int result = 0;
       foreach(int num in numSet){
        if(!numSet.Contains(num-1)){
            int sequence = 1;
            while(numSet.Contains(num + sequence)){
                sequence++;
            }
            result = Math.Max(result, sequence);
        }
       }
       return result;
    }
}