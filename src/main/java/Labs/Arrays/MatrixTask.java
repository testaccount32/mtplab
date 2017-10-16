package Labs.Arrays;

import java.util.Random;

public class MatrixTask {
    int sum[];
    int[][] matrix;
    int[][] baseMatrix = new int[9][9];
    int[][] myMatrix = new int[9][9];
    Random rand = new Random();

    public MatrixTask(int n) {
        matrix = new int[n][n];
        fillMatrix();
    }

    public MatrixTask(int[][] n,int[][] m) {
        matrix = new int[n.length][n[0].length];
        System.arraycopy(n,0,matrix,0,n.length);
        System.arraycopy(m,0,baseMatrix,0,m.length);
    }

    public int[] diagonalSum() {
        sum = new int[3];
        sum[0] = sum[1] = sum[2] = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (i > j) sum[0] += matrix[i][j];
                else if (i == j) sum[1] += matrix[i][j];
                else if (i < j) sum[2] += matrix[i][j];
        return sum;
    }

    public int[][] fillMatrix(){
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                matrix[i][j] = rand.nextInt() % 100;
        for (int i = 0; i < matrix.length; i++) {
            int j = 0;
            while (matrix[i][j] >= 0 && j < matrix.length - 1) {
                matrix[i][j] = 0;
                j++;
            }
        }
        showMatrix(matrix);
        for (int i = 0; i < 9; i++) for (int j = 0; j < 9; j++)
            baseMatrix[i][j] = rand.nextInt() % 100;
        System.out.println("baseMatrix");

        showMatrix(baseMatrix);
        return baseMatrix;
    }

    public int[][] create() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (baseMatrix[i][j] > baseMatrix[i][i])
                    myMatrix[i][j] = baseMatrix[i][j];
                else
                    myMatrix[i][j] = 0;
        return myMatrix;
    }

    public static void  showMatrix(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }
}
