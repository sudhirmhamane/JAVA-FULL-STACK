public class Factorial {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,8,4,13,};
        factorialNumber(arr);
    }

    public static void factorialNumber(int [] nums){
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int fact = 1;

            for(int j=1; j<=num; j++){
                
                    fact *= j;
                
            }

            System.out.println(num + "! = " + fact);

        }
    }
}
