class ArrayEleFreq{
    public static void main(String[] args){

        int a[] = {1,2,2,3,4,4,5,6};
        freq(a);
    }

    public static void freq(int nums[]){
        int min = min(nums);
        int max = max(nums);

        int count[] = new int[max+1];

        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        for(int i=min; i<count.length; i++){
            if(count[i]!=0){
                System.out.println(i+" => "+count[i]);
            }
        }
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