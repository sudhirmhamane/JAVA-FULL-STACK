public class LastUniqueIndex {
     public static void main(String[] args){

        int a[] = {2, 1,3,3, 4, 3, 4, 4,4,3};
        lastUniqueIndex(a);
    }

    public static void lastUniqueIndex(int nums[]){
        int max = max(nums);

        int count[] = new int[max+1];

        for(int i : nums){
            count[i]++;
        }

        for(int i = nums.length-1; i>=0; i--){
            if(count[nums[i]] == 1){
                System.out.println("index: "+ i);
                return ;
            }
        }
        // System.out.println("Least Freq element is: " + element);
    }
    public static int max(int nums[]){
        int max = Integer.MIN_VALUE;

        for(int i: nums){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
