import java.util.Arrays;

class Multiple10 {

    public static void main(String[] args) {

        int[] a = {7, 20, 30, 5, 11, 40, 15};
        segMultiple10(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segMultiple10(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            while (i < j && nums[i] % 10 == 0) {
                i++;
            }

            while (i < j && nums[j] % 10 != 0) {
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