public class Solution {
    public int UniquePaths(int m, int n) {
        int[,] grid = new int[m,n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                grid[i,j] = 1;
            }
        }

        for(int i = m-1-1; i >= 0; i--){
            for(int j = n-1-1; j >= 0; j--){
                grid[i, j] = grid[i + 1, j] + grid[i, j+1];
            }
        }

        return grid[0, 0];
    }
}