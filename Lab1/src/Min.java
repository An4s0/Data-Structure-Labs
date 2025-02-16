public class Min {
    public static void main(String[] args) throws Exception {

        // Define the arrays
        int[] array1 = { 5, 8, 3, 2, 3,1 };
        int[][] array2 = { { 9, 6, 2, 3, 6 }, { 7, 8, 9,-5, 7, 8, 20 } };

        // Define first num as min value
        int minA1 = array1[0];
        int minA2 = array2[0][0];

        // Find the min value of array 1
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < minA1) {
                minA1 = array1[i];
            }
        }

        // Find the min value of array 2
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] < minA2) {
                    minA2 = array2[i][j];
                }
            }
        }

        // Print the min value of the arrays
        System.out.println("The min of array1 number is " + minA1);
        System.out.println("The min of array2 number is " + minA2);
    }
}
