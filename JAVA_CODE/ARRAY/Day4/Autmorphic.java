


import java.util.Arrays;

class Autmorphic {
    public static void main(String[] args) {
        int[] a = { 49, 27, 21, 1234 };
        segAutomorphicNA(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segAutomorphicNA(int nums[]) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isAutomorphic(nums[i])) {
                i++;
            }

            while (i < j && !isAutomorphic(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }
    }

    static boolean isAutomorphic(int n) {

        int square = n * n;
        int temp = n;
        int digits = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int power = 1;

        for (int i = 1; i <= digits; i++) {
            power = power * 10;
        }
        return square % power == n;
    }
}


