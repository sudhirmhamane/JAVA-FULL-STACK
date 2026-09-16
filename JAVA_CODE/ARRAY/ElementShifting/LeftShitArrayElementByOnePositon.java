import java.util.Arrays;

public class LeftShitArrayElementByOnePositon {

    public static void main(String[] args) {
        int a [] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(a));
        leftShiftBy1Position(a);
        System.out.println(Arrays.toString(a));

    }

    public static void leftShiftBy1Position(int[] nums){
        int temp = nums[0];
        for(int i=0; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
    }
}