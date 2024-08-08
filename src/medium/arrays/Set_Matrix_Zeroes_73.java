package medium.arrays;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.
//
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

public class Set_Matrix_Zeroes_73 {

	public void setZeroes(int[][] matrix) {

		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];

		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if (matrix[i][j] == 0) {
					col[j] = 1;
					row[i] = 1;
				}
			}
		}
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}

	}

}
