import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {2,1,4, 5, 3};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            int minInx = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[minInx]){
                    minInx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minInx];
            nums[minInx] = temp;
        }
    }
}
