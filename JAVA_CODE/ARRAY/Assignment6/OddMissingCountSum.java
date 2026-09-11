public class OddMissingCountSum {

    public static void main(String[] args) {

        int a[] = {1, 2, 4, 6, 7, 9};

        oddMissingCountSum(a);
    }

    public static void oddMissingCountSum(int nums[]) {

        int max = max(nums);
        int min = min(nums);

        int count[] = new int[max + 1];

        for (int i : nums) {
            count[i]++;
        }

        int cnt = 0;
        int sum = 0;

        for (int i = min; i <= max; i++) {

            if (count[i] == 0 && i % 2 != 0) {

                cnt++;
                sum += i;
            }
        }

        System.out.println("Count: " + cnt);
        System.out.println("Sum: " + sum);
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

    public static int min(int nums[]) {

        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }
}