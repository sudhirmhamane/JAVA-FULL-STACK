public class OddFreq {
     public static void main(String[] args){

        int a[] = {1,1,1,1,1,2,2,3,3, 4, 3, 4, 4,4,3};
        oddFreqEle(a);
    }

    public static void oddFreqEle(int nums[]){
        int max = max(nums);
        int min = min(nums);

        int count[] = new int[max+1];

        for(int i : nums){
            count[i]++;
        }

        for(int i = min; i<count.length; i++){
            if(count[i] > 0 && count[i] % 2 !=0){
                System.out.println(i + " -> " + count[i]);
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
     public static int min(int nums[]) {

        int min = Integer.MAX_VALUE;

        for(int i : nums){
            if(i < min){
                min = i;
            }
        }

        return min;
    }
}
