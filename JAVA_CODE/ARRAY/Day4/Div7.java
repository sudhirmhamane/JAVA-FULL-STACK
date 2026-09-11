import java.util.Arrays;

class Div7 {

    public static void main(String[] args) {

        int[] a = {7, 6, 14, 9, 21, 5, 28};
        segDiv7(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segDiv7(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && nums[i] % 7 == 0) {
                i++;
            }

            while (i < j && nums[j] % 7 != 0) {
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