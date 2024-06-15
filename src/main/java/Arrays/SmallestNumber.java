package Arrays;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        String ans = "";
        for (int div = 9; div >= 2; div--) {
            while (n % div == 0) {
                n /= div;
                ans = div + ans;
            }
        }
        if (n != 1) {
            return -1;
        } else {
            return Integer.parseInt(ans);
        }
    }
}
