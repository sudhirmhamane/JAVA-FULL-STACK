import java.util.Arrays;

public class RightShiftArrayElementByOnePosition {
    
    public static void main(String[] args) {
        int a [] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(a));
        rightShiftBy1Position(a);
        System.out.println(Arrays.toString(a));

    }

    public static void rightShiftBy1Position(int[] nums){
        int temp = nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
    }
}
