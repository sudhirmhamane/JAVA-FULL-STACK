import java.util.Arrays;

class OneDigitTwoDigit {

    public static void main(String[] args) {

        int[] a = {12, 5, 78, 3, 9, 45, 7};
        segOneTwo(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segOneTwo(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isOneDigit(nums[i])) {
                i++;
            }

            while (i < j && !isOneDigit(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isOneDigit(int num) {
        return num >= 0 && num <= 9;
    }
}