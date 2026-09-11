public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int target = 6;
        System.out.println("index: " + binarySearch(arr, target));
        
    }

    public static int binarySearch(int[] nums, int target){
        int i=0;
        int j=nums.length-1;
        while (i <= j) {
            int mid = (i+j)/2;
            if(nums[mid] == target) return mid;

            else if(target > nums[i]) i = mid+1;

            else j = mid-1;
        }

        return -1;
    }
}
