import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(a));
        divide(a);
        System.out.println(Arrays.toString(a));
    }

    public static void divide(int[] nums){

        if(nums.length == 1) return ;
        int[] left = new int[nums.length/2];
        int[] right = new int[nums.length-left.length];

        for(int i=0; i<left.length; i++){
            left[i] = nums[i];
        }

        for(int i=0; i<right.length; i++){
            right[i] = nums[i+left.length];
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        divide(left);
        divide(right);
        merge(left, right, nums);

    }

    public static void merge(int[] left, int[] right, int[] nums){
        int l=0, r=0, n=0;
        while (l< left.length && r< right.length) {

            if(left[l] < right[r]){
                nums[n++] = left[l++];
            } else{
                nums[n++] = right[r++];
            }
        }

        while (l<left.length) {
            nums[n++] = left[l++];
        }

        while (r<right.length) {
            nums[n++] = right[r++];
        }

    }
}
