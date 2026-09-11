

import java.util.Arrays;

class BuzzNumNBN {
    public static void main(String[] args) {
        int[] a = { 49, 27, 21, 1234 };
        segBuzzNB(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segBuzzNB(int nums[]) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && isBuzzNum(nums[i])) {
                i++;
            }

            while (i < j && !isBuzzNum(nums[j])) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }
    }

    static boolean isBuzzNum(int n) {

        return n % 7 == 0 || n % 10 == 7;
    }
}

