package Problems.Arrays;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rorateby90(numbers);
        print(numbers);
    }

    public static void print(int[][] numbers) { //TC -> O(n^2) & SC -> O(1)
        for (int[] a : numbers) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void rorateby90(int[][] numbers) {
        //Step - 1 -> take transpose
        for (int index = 0; index < numbers.length; index++) {
            for (int j = index + 1; j < numbers[0].length; j++) {
                //Swap a[i][j] with a[j][i]
                int temp = numbers[index][j];
                numbers[index][j] = numbers[j][index];
                numbers[j][index] = temp;
            }
        }
        //Step - 2 -> swap the column
        int left = 0, right = numbers[0].length - 1;
        while (left < right) {
            for (int index = 0; index < numbers.length; index++) {
                int temp = numbers[index][left];
                numbers[index][left] = numbers[index][right];
                numbers[index][right] = temp;

            }
            left++;
            right--;
        }
    }
}
