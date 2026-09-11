
import java.util.Arrays;

class SegregatePosNeg{
    public static void main(String[] args){
        int [] a = {-9, -8, 5, 4, 3, -4};
        segPosNeg(a);
        System.out.println(Arrays.toString(a));

        System.out.println(625%20);
    }

    public static void segPosNeg(int nums[]){
        int i=0;
        int j = nums.length-1;

        while(i < j){

            while(i < j && isPositive(nums[i])){
                i++;
            }

            while(i < j && !isPositive(nums[j])){
                j--;
            }


            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
           
        }
    }

    public static boolean isPositive(int num){

        if(num > 0){
            return true;
        }
        return false;
    }
}
