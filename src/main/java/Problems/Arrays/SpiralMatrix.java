package Problems.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        spiralMatrix(numbers);
    }

    public static void spiralMatrix(int[][] numbers) {
        int n = numbers.length;
        int m = numbers[0].length;
        int rmin = 0, rmax = n - 1;
        int cmin = 0, cmax = m - 1;

        int count = 0;

        while (count < n * m) {
            // Top boundary
            for (int column = cmin; column <= cmax && count < n * m; column++) {
                System.out.print(numbers[rmin][column] + " ");
                count++;
            }
            rmin++;

            // Right boundary
            for (int row = rmin; row <= rmax && count < n * m; row++) {
                System.out.print(numbers[row][cmax] + " ");
                count++;
            }
            cmax--;

            // Bottom boundary
            for (int column = cmax; column >= cmin && count < n * m; column--) {
                System.out.print(numbers[rmax][column] + " ");
                count++;
            }
            rmax--;

            // Left boundary
            for (int row = rmax; row >= rmin && count < n * m; row--) {
                System.out.print(numbers[row][cmin] + " ");
                count++;
            }
            cmin++;
        }
    }
}
