

import java.util.Arrays;

class SegPrimeNP{
    public static void main(String[] args){
        int[] a = {2, 4, 5, 7, 9, 11, 15, 17};
        segPrimeNP(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segPrimeNP(int nums[]){
        int i=0;
        int j = nums.length-1;

        while(i < j){

            while(i < j && isPrime(nums[i])){
                i++;
            }

            while(i < j && !isPrime(nums[j])){
                j--;
            }


            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
           
        }
    }

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

