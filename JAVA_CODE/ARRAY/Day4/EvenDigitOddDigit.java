import java.util.Arrays;

class EvenDigitOddDigit {

    public static void main(String[] args) {

        int[] a = {123, 4567, 89, 12345, 67, 8};
        segEvenDigitOddDigit(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segEvenDigitOddDigit(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isEvenDigit(nums[i])) {
                i++;
            }

            while (i < j && !isEvenDigit(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isEvenDigit(int num) {

        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count % 2 == 0;
    }
}