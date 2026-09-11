import java.util.Arrays;

class NeonNonNeon {

    public static void main(String[] args) {

        int[] a = {9, 1, 10, 12, 81, 5};
        segNeonNonNeon(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segNeonNonNeon(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isNeon(nums[i])) {
                i++;
            }

            while (i < j && !isNeon(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isNeon(int num) {

        int sqr = num * num;
        int sum = 0;

        while (sqr > 0) {

            int digit = sqr % 10;

            sum = sum + digit;

            sqr = sqr / 10;
        }

        return sum == num;
    }
}