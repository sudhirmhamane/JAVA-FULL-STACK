import java.util.Arrays;

class LeapNonLeap {

    public static void main(String[] args) {

        int[] a = {2023, 2024, 2000, 1900, 2028, 2025};
        segLeapNonLeap(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segLeapNonLeap(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isLeap(nums[i])) {
                i++;
            }

            while (i < j && !isLeap(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isLeap(int year) {

        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }
}