public class MissingNumber {

    public static void main(String[] args) {

        int a[] = {3, 0, 1};

        missingNumber(a);
    }

    public static void missingNumber(int nums[]) {

        int n = nums.length;

        int formulaSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int i : nums) {
            actualSum += i;
        }

        int missing = formulaSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}