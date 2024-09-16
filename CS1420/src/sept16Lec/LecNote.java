package sept16Lec;

/**
 * @author Zifan Zuo
 * @version Sep 16, 2024
 */
public class LecNote {
    public static void main (String args[]) {
        // two-dimentional arrays
        // double[3][2] three is number of rows, two is columns
        double[][] matrix = new double[3][2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 0.0;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
