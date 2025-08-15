public class Solution {
    public int MinCostClimbingStairs(int[] cost) {
        if(cost.Length == 0) return 0;
        if(cost.Length == 1) return cost[0];
        int[] mem = new int[cost.Length];
        for(int i = 0; i < cost.Length; i++){
            mem[i] = 0;
        }
        mem[0] = cost[cost.Length - 1];
        mem[1] = cost[cost.Length - 2];
        for(int i = cost.Length - 3; i >= 0; i--){
            mem[cost.Length - i - 1] = cost[i] + Math.Min(mem[cost.Length - i - 2], mem[cost.Length - i - 3]);
        }
        return Math.Min(mem[cost.Length - 1], mem[cost.Length - 2]);
    }
}
