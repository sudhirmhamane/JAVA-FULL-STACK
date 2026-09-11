
import java.util.Arrays;

class PerfectNumNPN {
    public static void main(String[] args) {
        int[] a = { 49, 27, 21, 1234 };
        segPerfectNPN(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segPerfectNPN(int nums[]) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isPerfectNum(nums[i])) {
                i++;
            }

            while (i < j && !isPerfectNum(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }
    }

    static boolean isPerfectNum(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum == n;
    }
}

