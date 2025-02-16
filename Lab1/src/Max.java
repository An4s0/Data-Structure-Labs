public class Max {
    public static void main(String[] args) throws Exception {

        // Define the arrays
        int[] array1 = { 5, 8, 3, 2, 3 };
        int[][] array2 = { { 9, 6, 2, 3, 6 }, { 7, 8, 9, 7, 8, 20 } };

        // Define first num as max value
        int maxA1 = array1[0];
        int maxA2 = array2[0][0];

        // Find the max value of array 1
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > maxA1) {
                maxA1 = array1[i];
            }
        }

        // Find the max value of array 2
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > maxA2) {
                    maxA2 = array2[i][j];
                }
            }
        }

        // Print the max value of the arrays
        System.out.println("The max of array1 number is " + maxA1);
        System.out.println("The max of array2 number is " + maxA2);
    }
}
