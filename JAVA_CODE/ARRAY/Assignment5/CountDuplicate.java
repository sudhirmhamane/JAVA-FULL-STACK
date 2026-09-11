public class CountDuplicate {
    public static void main(String[] args){

        int a[] = {1, 2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4};
        countDuplicate(a);
    }

    public static void countDuplicate(int nums[]){
        // int min = min(nums);
        int max = max(nums);

        int count[] = new int[max+1];
        int countEle=0;

        // for(int i=0; i<nums.length; i++){
        //     count[nums[i]]++;
        // }
        for(int i : nums){
            count[nums[i]]++;
        }

        // for(int i=min; i<count.length; i++){
        //     if(count[i] > 1){
        //         countEle++;
        //     }
        // }
        for(int i : count){
            if(i > 1){
                countEle++;
            }
        }
        System.out.println("Total duplicate element : "+ countEle);
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
