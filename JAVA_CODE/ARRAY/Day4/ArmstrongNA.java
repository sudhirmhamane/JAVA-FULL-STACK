
import java.util.Arrays;

class ArmstrongNA {
    public static void main(String[] args) {
        int[] a = { 121, 123, 454, 567, 22, 89 };
        segArmstrong(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segArmstrong(int nums[]) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isArmstrong(nums[i])) {
                i++;
            }

            while (i < j && !isArmstrong(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }
    }

    static boolean isArmstrong(int n) {

        int temp = n;
        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + digit * digit * digit;

            temp = temp / 10;
        }

        return sum == n;
    }
}
