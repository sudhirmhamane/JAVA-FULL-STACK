public class LastUnique {
     public static void main(String[] args){

        int a[] = {2,3,3, 4, 3, 4, 4,4,3,5,6};
        lastUnique(a);
    }

    public static void lastUnique(int nums[]){
        int max = max(nums);
        int min = min(nums);

        int count[] = new int[max+1];

        for(int i : nums){
            count[i]++;
        }

        for(int i = count.length-1; i>min; i--){
            if(count[i] == 1){
                System.out.println(i + " -> " + count[i]);
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
