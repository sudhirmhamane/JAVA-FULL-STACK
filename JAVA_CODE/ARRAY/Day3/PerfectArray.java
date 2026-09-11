class PerfectArray {
    public static void main(String[] args) {

        int[] a = {6, 10, 28, 15, 496, 20};

        int count = 0;

        // Count Perfect numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int sum = 0;

            for (int j = 1; j < n; j++) {

                if (n % j == 0) {
                    sum = sum + j;
                }
            }

            if (sum == n) {
                count++;
            }
        }

        // Create new array
        int[] perfect = new int[count];

        int index = 0;

        // Store Perfect numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int sum = 0;

            for (int j = 1; j < n; j++) {

                if (n % j == 0) {
                    sum = sum + j;
                }
            }

            if (sum == n) {

                perfect[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < perfect.length; i++) {

            System.out.print(perfect[i] + " ");
        }
    }
}