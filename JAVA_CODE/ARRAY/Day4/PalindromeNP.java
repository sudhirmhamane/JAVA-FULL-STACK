

import java.util.Arrays;

class PalindromeNP{
    public static void main(String[] args){
       int[] a = {121, 123, 454, 567, 22, 89};
        segPalindromeNP(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segPalindromeNP(int nums[]){
        int i=0;
        int j = nums.length-1;

        while(i < j){

            while(i < j && isPalindrome(nums[i])){
                i++;
            }

            while(i < j && !isPalindrome(nums[j])){
                j--;
            }


            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
           
        }
    }

    static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }
}

