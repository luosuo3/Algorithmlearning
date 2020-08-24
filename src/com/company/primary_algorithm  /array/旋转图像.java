package com.company.primary_algorithm.array;//给定一个 n × n 的二维矩阵表示一个图像。
//
// 将图像顺时针旋转 90 度。 
//
// 说明： 
//
// 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。 
//
// 示例 1: 
//
// 给定 matrix = 
//[
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
//],
//
//原地旋转输入矩阵，使其变为:
//[
//  [7,4,1],
//  [8,5,2],
//  [9,6,3]
//]
// 
//
// 示例 2: 
//
// 给定 matrix =
//[
//  [ 5, 1, 9,11],
//  [ 2, 4, 8,10],
//  [13, 3, 6, 7],
//  [15,14,12,16]
//], 
//
//原地旋转输入矩阵，使其变为:
//[
//  [15,13, 2, 5],
//  [14, 3, 4, 1],
//  [12, 6, 8, 9],
//  [16, 7,10,11]
//]
// 
// Related Topics 数组 
// 👍 540 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class 旋转图像 {
    public void rotate(int[][] matrix) {
        int tmp1, tmp2, tmp3, len = matrix.length;
        for (int i = 0; i <len/2 ; i++) {
            for (int j = i; j < len-i-1; j++) {
//                上转右
                tmp1 = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = matrix[i][j];
//                右转下
                tmp2 = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1]=tmp1;
//                下转左
                tmp3 = matrix[len - j - 1][i];
                matrix[len - j - 1][i]=tmp2;
//                左转上
                matrix[i][j] = tmp3;

            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
