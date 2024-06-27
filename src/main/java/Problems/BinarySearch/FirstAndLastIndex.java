package Problems.BinarySearch;
import java.util.*;

public class FirstAndLastIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numbers = new int[num];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt();
        }
        firstAndLastPosition(numbers, 5);
    }

    public static void firstAndLastPosition(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1, first = -1;

        // Find the first occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                first = mid;
                right = mid - 1; // move left to find the first occurrence
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = numbers.length - 1;
        int last = -1;

        // Find the last occurrence
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                last = mid;
                left = mid + 1; // move right to find the last occurrence
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(first + " " + last);
    }
}
