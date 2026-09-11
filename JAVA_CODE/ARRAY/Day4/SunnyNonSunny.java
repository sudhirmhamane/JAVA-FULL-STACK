import java.util.Arrays;

class SunnyNonSunny {

    public static void main(String[] args) {

        int[] a = {8, 3, 15, 24, 48, 80};
        segSunnyNonSunny(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segSunnyNonSunny(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isSunny(nums[i])) {
                i++;
            }

            while (i < j && !isSunny(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isSunny(int num) {

        int n = num + 1;
        int i = 1;

        while (i * i <= n) {

            if (i * i == n) {
                return true;
            }

            i++;
        }

        return false;
    }
}