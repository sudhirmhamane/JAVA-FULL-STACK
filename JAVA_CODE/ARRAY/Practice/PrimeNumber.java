public class PrimeNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,84,4,43,};
        primeNumber(arr);
    }

    public static void primeNumber(int [] nums){
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int count = 0;

            for(int j=1; j<=num; j++){
                if(num % j == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println(num);
            }
        }
    }
}
