public class Solution {
    public int UniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.Length;
        int width = obstacleGrid[0].Length;
        
        if(obstacleGrid[0][0] == 1 || obstacleGrid[height-1][width-1] == 1) return 0;


        int[,] grid = new int[height,width];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(i == 0 && j == 0){
                    grid[i,j] = 1;
                    continue;
                }
                if(obstacleGrid[i][j] == 1) {
                    grid[i,j] = 0;
                    continue;
                }
                grid[i, j] = 0;
                if(i > 0){
                    grid[i,j] += grid[i-1, j];
                }
                if(j > 0){
                    grid[i,j] += grid[i,j-1];
                }
            }
        }
        return grid[height-1,width-1];
    }
}