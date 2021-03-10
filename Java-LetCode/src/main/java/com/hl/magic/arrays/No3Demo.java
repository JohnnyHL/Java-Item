package com.hl.magic.arrays;

import com.hl.magic.utils.ArraysUtils;

/**
 * 转置矩阵
 *
 * 给定一个二维整数数组matrix，返回matrix的转置矩阵
 * <p>
 * 解题思路：
 * 转置矩阵就是将一个m行n列的矩阵，交换对角线后转换为一个n行m列的矩阵
 *
 * @author hl
 * @date 2021/3/9 16:03
 */
public class No3Demo {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] transpose = transpose(matrix);
        for (int i = 0; i < transpose.length; i++) {
            ArraysUtils.convertToIntArray(transpose[i]);
        }
    }

    public static int[][] transpose(int[][] matrix) {
        //定义一个matrix的矩阵matrxT
        int[][] matrixT = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrixT.length; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }
        return matrixT;
    }
}
