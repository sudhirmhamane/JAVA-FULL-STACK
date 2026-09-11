import java.util.Arrays;

class SegregateEvenOdd{
    public static void main(String[] args){
        int [] a = {4,5,6,8,9,1};
        segEvenOdd(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segEvenOdd(int [] nums){
        int i=0;
        int j = nums.length-1;

        while(i < j){

            while(i < j && isEven(nums[i])){
                i++;
            }

            while(i < j && !isEven(nums[j])){
                j--;
            }


            if(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
            }
        }
    }

    public static boolean isEven(int num){

        return num % 2 == 0;
    }
}