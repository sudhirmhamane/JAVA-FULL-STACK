public class MostFreqEle {
    public static void main(String[] args){

        int a[] = {1,2, 3, 4, 3, 4, 4};
        mostFreqEle(a);
    }

    public static void mostFreqEle(int nums[]){
        int max = max(nums);
        int min = min(nums);

        int count[] = new int[max+1];

        for(int i : nums){
            count[i]++;
        }

        int mostFreq = 0;
        int element = 0;

        for(int i = min; i<count.length; i++){
            if(count[i] > mostFreq){
                mostFreq = count[i];
                element = i;
            }
        }
        System.out.println("Most Freq element is: " + element);
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
