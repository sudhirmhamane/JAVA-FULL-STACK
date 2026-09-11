import java.util.Arrays;

public class ReplaceDupWithZero {
    public static void main(String[] args) {

        int a[] = {1, 2, 2, 3, 4, 4, 5, 6};

        int result[] = replaceDuplicatewithZero(a);

        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceDuplicatewithZero(int nums[]) {

        // int min = min(nums);
        int max = max(nums); 

        int count[] = new int[max + 1];

        // Count frequency
        for(int i : nums){
            count[i]++;
        }

        // Replace duplicate elements with -1
        for(int i : nums){
            if(count[nums[i]] > 1){
                nums[i] = 0;
            }
        }

        return nums;
    }

    public static int min(int nums[]) {

        int min = Integer.MAX_VALUE;

        for(int i : nums){
            if(i < min){
                min = i;
            }
        }

        return min;
    }

    public static int max(int nums[]) {

        int max = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > max){
                max = i;
            }
        }

        return max;
    }
}
