import java.util.Arrays;

public class Lesson15Program {
    public static void main(String[] args) {
        Matrix matrixObject = new Matrix();
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        int[][] matrix3 = new int[0][0];
        int[][] matrix4 = null;
        int[][] matrix5 = new int[5][8];
        for (int i = 0; i < matrix3.length; i++) {
            System.out.println(Arrays.toString(matrix3[i]));
        }
        System.out.println(matrixObject.isSquareMatrix(matrix1));
        System.out.println(matrixObject.isSquareMatrix(matrix2));
        System.out.println(matrixObject.isSquareMatrix(matrix3));
        System.out.println(matrixObject.isSquareMatrix(matrix4));
        System.out.println(matrixObject.isSquareMatrix(matrix5));
    }
}
