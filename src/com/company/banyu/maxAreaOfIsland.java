package com.company.banyu;

/**
 * @author 王峥
 * @date 2021/1/3 3:16 下午
 */
/*

给定一个包含了一些 0 和 1 的非空二维数组 grid 。

一个 岛屿 是由一些相邻的 1 (代表土地) 构成的组合，这里的「相邻」要求两个 1 必须在水平或者竖直方向上相邻。你可以假设 grid 的四个边缘都被 0（代表水）包围着。

找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为 0 。
* */
public class maxAreaOfIsland {
    public static int maxArea(int [][] grid) {
        int are = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                are = Math.max(are,dfs(i,j,grid));
            }
        }
        return are;
    }

    private static int dfs(int i,int j,int [][] grid) {
        if (i<0 || j<0|| i >grid.length|| j > grid[i].length || grid[i][j]==0) {
            return 0;
        }
        int are = 1;
        grid[i][j] = 0;
        are+=dfs(i - 1, j, grid);
        are+=dfs(i + 1, j, grid);
        are+=dfs(i, j+1, grid);
        are+=dfs(i, j - 1, grid);
        return are;
    }

}
