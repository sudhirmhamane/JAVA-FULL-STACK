class PalindromeArray {
    public static void main(String[] args) {

        int[] a = {121, 123, 454, 567, 787, 100};

        int count = 0;

        // Count Palindrome numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int reverse = 0;

            while (temp > 0) {

                int rem = temp % 10;

                reverse = reverse * 10 + rem;

                temp = temp / 10;
            }

            if (reverse == n) {
                count++;
            }
        }

        // Create new array
        int[] palindrome = new int[count];

        int index = 0;

        // Store Palindrome numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int reverse = 0;

            while (temp > 0) {

                int rem = temp % 10;

                reverse = reverse * 10 + rem;

                temp = temp / 10;
            }

            if (reverse == n) {

                palindrome[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < palindrome.length; i++) {

            System.out.print(palindrome[i] + " ");
        }
    }
}