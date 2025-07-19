
public class pc_array {
    public static void main(String[] args) {

//       Problem 1
 /*     float[] arr  = new float[] {1.3f,33.0f,23.3f,32.4f};
        float sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("the sum is " +sum);

        float[] marks = {67.3f, 87.3f, 97.2f, 73.1f, 92.5f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The sum is : " + sum);
*/

//        Problem 2
/*
        int[] marks = {92, 49, 73, 67, 35, 93, 74, 88, 83};
        int num = 35;
        boolean IsanArray = false;

        for (int element : marks) {
            if (num == element) {
                IsanArray = true;
                break;
            }
        }
        if (IsanArray) {
            System.out.println("the element is persent in arrray!!!");
        } else {
            System.out.println("Not persent is array");
    }
  */

//        Problem 3:

/*      int[] phy = {89, 78, 67, 85, 98};
        int sum = 0;

        for (int element : phy) {
            sum = sum + element;
        }

        int avg = sum / phy.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

 */

//        Problem 4

/*      int[][] arr = {{1, 2, 3}, {3, 4, 5}};
        int[][] arr1 = {{4, 5, 6}, {9, 6, 2}};
        int[][] result = new int[2][3];

        int add = 0;
        System.out.println("First array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Second array is: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("The sum of two matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
*/
//        Problem 5
/*        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("array reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
*/
//        Problem 6
/*        int[] arr = {10, 20, 30, 40, 50};
        int max = arr[0];
        System.out.println("maximum element is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Maximum element in the array is: " + max);

 */
//        Problem 7

/*        float[] arr = {10.3f, 23.5f, 34.4f, 72.1f, 9.1f};
        float min = arr[0];
        float max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
            System.out.println("Minimum element in the array is: " + min);
            System.out.println("Maximum element in the array is: " + max);

 */
//        Problem 8
        int[] arr = {10, 20, 30, 40, 50};
        boolean isStored = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isStored = false;
                break;
            }
        }
        if (isStored) {
            System.out.println("The array is stored in acending order.");
        } else {
            System.out.println("The array is not stored.");
        }


    }
}
 