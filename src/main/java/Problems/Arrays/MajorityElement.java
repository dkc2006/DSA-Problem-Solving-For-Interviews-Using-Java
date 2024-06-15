package Problems.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, 2, 4, 4, 5, 2, 4, 7, 4, 4, 2, 2, 2, 2, 2, 2, 2, 2};
        System.out.println(majorityElement(arr, arr.length));
    }

    public static int majorityElement(int[] nums, int n) {
        int candidate = nums[0];
        int count = 1;

        // Find the candidate
        for (int index = 1; index < n; index++) {
            if (nums[index] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = nums[index];
                count = 1;
            }
        }

        // Verify if candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
