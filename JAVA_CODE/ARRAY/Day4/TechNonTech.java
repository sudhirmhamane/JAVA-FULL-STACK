import java.util.Arrays;

class TechNonTech {

    public static void main(String[] args) {

        int[] a = {2025, 1234, 3025, 81, 2025, 45};
        segTechNonTech(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segTechNonTech(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isTech(nums[i])) {
                i++;
            }

            while (i < j && !isTech(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isTech(int num) {

        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        if (digits % 2 != 0) {
            return false;
        }

        int div = 1;

        for (int i = 1; i <= digits / 2; i++) {
            div = div * 10;
        }

        int first = num / div;
        int second = num % div;

        int sum = first + second;

        return sum * sum == num;
    }
}