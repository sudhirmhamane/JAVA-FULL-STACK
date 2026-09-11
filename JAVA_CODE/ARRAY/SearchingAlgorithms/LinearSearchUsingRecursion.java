public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int target = 6;
        System.out.println("index of target element is: " + linearSearch(arr,target,0));
    }

    public static int linearSearch(int[] nums, int target, int i){

        if(i >= nums.length) return -1;
        if(nums[i] == target){
            return i;
        }
        return linearSearch(nums, target, i+1);
    }
}
