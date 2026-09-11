class StrongArray {
    public static void main(String[] args) {

        int[] a = {145, 123, 2, 40585, 100, 145};

        int count = 0;

        // Count Strong numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int sum = 0;

            while (temp > 0) {

                int rem = temp % 10;

                int factorial = 1;

                for (int j = 1; j <= rem; j++) {
                    factorial = factorial * j;
                }

                sum = sum + factorial;

                temp = temp / 10;
            }

            if (sum == n) {
                count++;
            }
        }

        // Create new array
        int[] strong = new int[count];

        int index = 0;

        // Store Strong numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int sum = 0;

            while (temp > 0) {

                int rem = temp % 10;

                int factorial = 1;

                for (int j = 1; j <= rem; j++) {
                    factorial = factorial * j;
                }

                sum = sum + factorial;

                temp = temp / 10;
            }

            if (sum == n) {

                strong[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < strong.length; i++) {

            System.out.print(strong[i] + " ");
        }
    }
}