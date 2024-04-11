public class Matrix {

    public double avgArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    public boolean isSquareMatrix(int[][] matrix){

        if(matrix == null){
            return false;
        }

        if (matrix.length == 0){
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length)
                return false;
        }

        return true;
    }
}
