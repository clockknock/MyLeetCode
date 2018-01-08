package priv.zhong.leetcode.easy;

/**
 * @author 钟未鸣
 * @date 2018/1/6
 * In MATLAB, there is a very useful function called 'reshape',
 * which can reshape a matrix into a new one with different size but keep its original data.

 You're given a matrix represented by a two-dimensional array, and two positive
 integers r and c representing the row number and column number of the wanted
 reshaped matrix, respectively.

 The reshaped matrix need to be filled with all the elements of the original matrix
 in the same row-traversing order as they were.

 If the 'reshape' operation with given parameters is possible and legal, output
 the new reshaped matrix; Otherwise, output the original matrix.
 */
public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] nums ={{1,2},{2,1}};
        int[][] ints = matrixReshape(nums, 1, 2);
        System.out.println(ints);
    }

    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] target = new int[r][c];
        int originSize = 0;
        int[] temp = new int[r * c];
//        int outerLen = nums.length;
        int index = 0;
        for (int[] num : nums) {
//            int innerLen = num.length;
            for (int aNum : num) {
                try {
                    temp[index] = aNum;
                    originSize++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    return nums;
                }
                index++;
            }
        }

        if (originSize != r * c) {
            return nums;
        }

        index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                target[i][j]=temp[index];
                index++;
            }
        }
        return target;
    }
}
