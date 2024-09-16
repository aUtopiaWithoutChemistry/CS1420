package sept16Lec;

/**
 * @author Zifan Zuo
 * @version Sep 16, 2024
 */
public class LecNote09 {
    public static void main (String args[]) {
        // two-dimentional arrays
        // double[3][2] three is number of rows, two is columns
        double[][] matrix = new double[3][2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 0.0;
            }
        }

        double[] array = new double[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0.0;
        }

        printArray(matrix);
        printArray(array);

        // method overloading

        // the "String[] args" of main's parameter.
    }

    /**
     * to print a 2D array
     *
     * @param array a 2D array
     */
    private static void printArray(double[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]);
                if (col < array[row].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // use the same method name but different method signiature
    // to overloading a method.
    /**
     * to print out a 1D array
     *
     * @param array a 1D array
     */
    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }


}
