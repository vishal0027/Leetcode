class Solution {
    public void rotate(int[][] matrix) {
            flip(transpose(matrix));
    }
    private int[][] transpose(int[][] matrix){              // Calculatting transpose of matrix
        for(int i=0;i< matrix.length;i++){
            for(int j=i+1;j< matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }   
        return matrix;
    }
    private void flip(int[][] matrix){                      // Fliping the matrix horizontly
         for(int i=0;i< matrix.length;i++){
            for(int j=0; j< matrix[i].length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length-j-1];
                matrix[i][matrix[i].length-j-1] = temp;
            }
        }
    }
}