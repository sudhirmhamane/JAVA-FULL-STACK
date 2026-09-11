import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {2,1,4, 5, 3};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] nums){
        for(int i=1; i<nums.length; i++){
            int temp = nums[i];
            int j = i-1;
            while (j>=0 && nums[j]>temp) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = temp ;
        }
    }
}

