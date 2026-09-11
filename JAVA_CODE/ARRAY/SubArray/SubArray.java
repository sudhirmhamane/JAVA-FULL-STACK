import java.util.Arrays;

class SubArray{
    public static void main(String[] args) {
     
        int a [] = {10, 20, 30, 40};
        System.out.println(Arrays.toString(a));
        subArray(a);
        System.out.println(Arrays.toString(a));
    }
    public static void subArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(nums[k]);
                    if(k<j){
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }
}