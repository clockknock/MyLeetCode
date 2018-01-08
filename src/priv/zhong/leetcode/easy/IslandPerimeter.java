package priv.zhong.leetcode.easy;

/**
 * @author 钟未鸣
 * @date 2018/1/8
 * You are given a map in form of a two-dimensional integer grid where 1 represents
 * land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one
 * island (i.e., one or more connected land cells). The island doesn't have
 * "lakes" (water inside that isn't connected to the water around the island).
 * One cell is a square with side length 1. The grid is rectangular, width and height don't
 * exceed 100. Determine the perimeter of the island.
 */
public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        int i = islandPerimeterVer02(grid);
        System.out.println(i);
    }

    private static int islandPerimeterVer02(int[][] grid) {//208ms 136ms-over 80%
        int perimeter = 0;
        //目前i是行,j是列
        for (int i = 0; i < grid.length; i++) {
            int[] currentI = grid[i];
            for (int j = 0; j < currentI.length; j++) {
                if (currentI[j] == 1) {
                    perimeter += 4;
                    //如果当前格上面有一格并且同一位置有面积,则边长-1
                    if (i - 1 >= 0 && grid[i - 1][j] != 0) {
                        System.out.println("当前在" + (i+1) + "行," + (j+1) + "列,上边有格子");
                        perimeter-=2;
                    }
                    //如果当前格左边有一格并且有面积,则边长-1
                    if (j - 1 >= 0 && currentI[j - 1] != 0) {
                        System.out.println("当前在" + (i+1) + "行," + (j+1) + "列,左边有格子");
                        perimeter-=2;
                    }

                }
            }
        }
        return perimeter;
    }

    /*private static int islandPerimeterVer01(int[][] grid) {
        int perimeter = 0;
        //目前i是行,j是列
        for (int i = 0; i < grid.length; i++) {
            int[] currentI = grid[i];
            for (int j = 0; j < currentI.length; j++) {
                if (currentI[j] == 1) {
                    perimeter += 4;
                    //如果当前格上面有一格并且同一位置有面积,则边长-1
                    if (i - 1 >= 0 && grid[i - 1][j] != 0) {
                        System.out.println("当前在" + (i+1) + "行," + (j+1) + "列,上边有格子");
                        perimeter--;
                    }
                    //如果当前格左边有一格并且有面积,则边长-1
                    if (j - 1 >= 0 && currentI[j - 1] != 0) {
                        System.out.println("当前在" + (i+1) + "行," + (j+1) + "列,左边有格子");
                        perimeter--;
                    }
                    //如果当前格右边有一格并且有面积,则边长-1
                    if (j + 1 <= currentI.length && currentI[j + 1] != 0) {
                        System.out.println("当前在" + (i+1) + "行," + (j+1) + "列,右边有格子");
                        perimeter--;
                    }
                    //如果当前格下边有一格并且有面积,则边长-1
                    if (i + 1 < grid.length && grid[i + 1][j] != 0) {
                        System.out.println("当前在" + (i+1) + "行," + (j+1) + "列,下边有格子");
                        perimeter--;
                    }
                }
            }
        }
        return perimeter;
    }*/
}
