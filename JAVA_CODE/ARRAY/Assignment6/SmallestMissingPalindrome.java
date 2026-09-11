public class SmallestMissingPalindrome {

    public static void main(String[] args) {

        int a[] = {1, 2, 4, 6, 7, 9};

        smallestMissingPalindrome(a);
    }

    public static void smallestMissingPalindrome(int nums[]) {

        int max = max(nums);
        int min = min(nums);

        int count[] = new int[max + 1];

        for (int i : nums) {
            count[i]++;
        }

        for (int i = min; i <= max; i++) {

            if (count[i] == 0 && isPalindrome(i)) {

                System.out.println("Smallest missing palindrome: " + i);
                return;
            }
        }
    }

    public static boolean isPalindrome(int n) {

        int original = n;
        int rev = 0;

        while (n > 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return original == rev;
    }

    public static int max(int nums[]) {

        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > max) max = i;
        }

        return max;
    }

    public static int min(int nums[]) {

        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i < min) min = i;
        }

        return min;
    }
}