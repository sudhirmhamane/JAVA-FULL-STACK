import java.util.Arrays;

class HappyNonHappy {

    public static void main(String[] args) {

        int[] a = {19, 20, 7, 10, 13, 4};
        segHappyNonHappy(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segHappyNonHappy(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isHappy(nums[i])) {
                i++;
            }

            while (i < j && !isHappy(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isHappy(int num) {

        while (num != 1 && num != 4) {

            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit * digit;
                num = num / 10;
            }

            num = sum;
        }

        return num == 1;
    }
}