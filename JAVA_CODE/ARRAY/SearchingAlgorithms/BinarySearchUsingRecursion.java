public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int target = 6;
        System.out.println("index: " + binarySearch(arr, target, 0, arr.length-1));
        
    }

    public static int binarySearch(int[] nums, int target, int i, int j){

        if(i >= nums.length){
            return -1;
        }
        int mid = (i+j)/2;
        if(nums[mid] == target) return mid;
        else if(target > nums[i]) i = mid+1;
        else j = mid -1;
        return binarySearch(nums, target, i, j);
    
    }
}
