import java.util.Arrays;

class SingleMulti {

    public static void main(String[] args) {

        int[] a = {12, 5, 78, 3, 9, 123, 7};
        segSingleMulti(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segSingleMulti(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isSingleDigit(nums[i])) {
                i++;
            }

            while (i < j && !isSingleDigit(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isSingleDigit(int num) {
        return num >= 0 && num <= 9;
    }
}