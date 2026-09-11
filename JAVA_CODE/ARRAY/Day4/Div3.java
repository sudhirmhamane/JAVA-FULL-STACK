import java.util.Arrays;

class Div3 {

    public static void main(String[] args) {

        int[] a = {7, 6, 8, 9, 12, 5, 15};
        segDiv3(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segDiv3(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && nums[i] % 3 == 0) {
                i++;
            }

            while (i < j && nums[j] % 3 != 0) {
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