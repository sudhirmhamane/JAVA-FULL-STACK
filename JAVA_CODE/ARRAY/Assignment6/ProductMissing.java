public class ProductMissing {

    public static void main(String[] args) {

        int a[] = {1, 2, 4, 6, 7, 9};

        productMissing(a);
    }

    public static void productMissing(int nums[]) {

        int max = max(nums);
        int min = min(nums);

        int count[] = new int[max + 1];

        for (int i : nums) {
            count[i]++;
        }

        int product = 1;

        for (int i = min; i <= max; i++) {

            if (count[i] == 0) {
                product *= i;
            }
        }

        System.out.println("Product of missing elements: " + product);
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