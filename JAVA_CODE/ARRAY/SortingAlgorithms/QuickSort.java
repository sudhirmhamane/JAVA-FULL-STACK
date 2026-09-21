import java.util.Arrays;

class QuickSort{

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] nums){

        // base condition
        if(nums.length <= 1) return ;

        // first select the pivot from the last index
        int pivot = nums[nums.length-1];

        // count the smallest and largest elements present inside nums[] and based on the count
        // create new left array and right array.

        int smallestCount = 0, largestCount = 0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < pivot){
                smallestCount++;
            } else{
                largestCount++;
            }
        }

        // create two arrays
        // left array -> to store the smallest elements before pivot.
        // right array -> to store the largest elements after pivot.

        int[] left = new int[smallestCount];
        int[] right = new int[largestCount];

        // to increment or add element inside array we take pointers
        int l=0, r=0, n=0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] < pivot){
                left[l++] = nums[i];
            } else{
                right[r++] = nums[i];
            }
        }

        // recursivly calling method to sort all the elements 
        quickSort(left);
        quickSort(right);

        // after above code the left array is sorted and right array also sorted so we
        // now we combine the left array + pivot + right array inside nums[]

        for(int i=0; i<left.length; i++){
            nums[n++] = left[i];
        }

        nums[n++] = pivot; 

        for(int i=0; i<right.length; i++){
            nums[n++] = right[i];
        }
    }
}