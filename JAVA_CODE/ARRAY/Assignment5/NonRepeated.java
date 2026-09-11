public class NonRepeated {
    public static void main(String[] args){

        int a[] = {1, 2,3,4,5,6,7,8,9,9,8,7,6,5,4};
        totalUniqueEle(a);
    }

    public static void totalUniqueEle(int nums[]){
        int max = max(nums);

        int count[] = new int[max+1];

        for(int i : nums){
            count[i]++;
        }

        for(int j : nums){
            if(count[j] == 1){
                System.out.print(j + " ");
            }
        }
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
