public class TotalDistinctEle {
    public static void main(String[] args){

        int a[] = {1, 2, 2, 3, 1, 4};
        totalDistinct(a);
    }

    public static void totalDistinct(int nums[]){
        int min = min(nums);
        int max = max(nums);

        int count[] = new int[max+1];
        int countEle = 0;

        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        for(int i=min; i<count.length; i++){
            if(count[i] > 0){
                countEle++;
            }
        }
        System.out.println("Total count of Distinct Element is: " + countEle);
    }

    public static int min(int nums[]){
        int min = Integer.MAX_VALUE;

        for(int i: nums){
            if(i<min){
                min=i;
            }
        }
        return min;
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
