public class Factors {
   public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,8,4,13,};
        factor(arr);
    }

    public static void factor(int [] nums){
        for(int i=0; i<nums.length; i++){
            int num = nums[i];

            System.out.println("Factors of " + num + ": ");
            for(int j=1; j<=num; j++){
                if(num % j == 0){
                    // System.out.println("factors of "+ num);
                    System.out.println(j+" ");
                }
            }

        }
    } 
}
