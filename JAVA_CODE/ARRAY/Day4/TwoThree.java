import java.util.Arrays;

class TwoThree {

    public static void main(String[] args) {

        int[] a = {123, 45, 678, 12, 89, 345, 7};
        segTwoThree(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segTwoThree(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isTwoDigit(nums[i])) {
                i++;
            }

            while (i < j && !isTwoDigit(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isTwoDigit(int num) {
        return num >= 10 && num <= 99;
    }
}