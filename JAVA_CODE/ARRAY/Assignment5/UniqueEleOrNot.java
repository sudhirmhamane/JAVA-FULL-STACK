// import java.util.Scanner;

public class UniqueEleOrNot {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        isUnique(a);
    }

    public static void isUnique(int nums[]) {
        int max = max(nums);

        int count[] = new int[max + 1];
        boolean isUnique = true;

        for (int i : nums) {
            count[i]++;
        }

        for (int i : count) {
            if (i > 1) {
                isUnique = false;
            }
        }
        if(isUnique){
            System.out.println("All Elements are Unique");
        } else{
            System.out.println("All Elements are not Unique");
        }

    }

    public static int max(int nums[]) {
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
