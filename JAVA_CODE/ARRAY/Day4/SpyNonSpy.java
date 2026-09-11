import java.util.Arrays;

class SpyNonSpy {

    public static void main(String[] args) {

        int[] a = {1124, 123, 22, 1234, 1412};
        segSpyNonSpy(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segSpyNonSpy(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isSpy(nums[i])) {
                i++;
            }

            while (i < j && !isSpy(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isSpy(int num) {

        int sum = 0;
        int prod = 1;

        while (num > 0) {

            int digit = num % 10;

            sum = sum + digit;
            prod = prod * digit;

            num = num / 10;
        }

        return sum == prod;
    }
}