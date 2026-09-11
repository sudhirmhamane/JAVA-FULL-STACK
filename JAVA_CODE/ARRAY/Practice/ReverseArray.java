public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {10, 30, 40, 50};
        reverseArray(arr);
    }

    public static void reverseArray(int [] nums){

            int i=0;
            int k=nums.length-1;

            while(i<k){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                i++;
                k--;
            }

        for(int j=0; j<nums.length; j++){
            System.out.print(nums[j]+ " ");
        }
    }
}
