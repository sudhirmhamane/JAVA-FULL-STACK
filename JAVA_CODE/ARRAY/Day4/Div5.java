import java.util.Arrays;

class Div5 {

    public static void main(String[] args) {

        int[] a = {7, 10, 8, 15, 11, 20, 3};
        segDiv5(a);

        System.out.println( Arrays.toString(a));
    }

    public static void segDiv5(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && nums[i] % 5 == 0) {
                i++;
            }

            while (i < j && nums[j] % 5 != 0) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}