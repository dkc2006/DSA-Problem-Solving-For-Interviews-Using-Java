package Problems.BinarySearch;

public class SearchInSortedAndRotatedArray {
    public static int searchInSortedAndRotatedArray(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
            // Check if the left half is sorted
            if (numbers[start] <= numbers[mid]) {
                if (numbers[start] <= target && target < numbers[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // If left half is not sorted, then the right half must be sorted
            else {
                if (numbers[mid] < target && target <= numbers[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 11, 14, 15, 20, 22, 25, 1, 3, 5, 7};
        int target = 14;
        System.out.println(searchInSortedAndRotatedArray(numbers, target));
    }
}