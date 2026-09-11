
import java.util.Arrays;

public class NewArrayWithoutDuplicate {

    public static void main(String[] args) {

        int a[] = {1, 2, 1, 3, 2, 4};

        int result[] = newArrayWithoutDuplicate(a);

        System.out.println(Arrays.toString(result));
    }

    public static int[] newArrayWithoutDuplicate(int nums[]) {

        int min = min(nums);
        int max = max(nums);

        int count[] = new int[max + 1];
        int countEle = 0;

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Count distinct elements
        for (int i = min; i < count.length; i++) {
            if (count[i] > 0) {
                countEle++;
            }
        }

        // Create result array
        int result[] = new int[countEle];

        int index = 0;

        // Store distinct elements
        for (int i = min; i < count.length; i++) {
            if (count[i] > 0) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }

    public static int min(int nums[]) {

        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static int max(int nums[]) {

        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}