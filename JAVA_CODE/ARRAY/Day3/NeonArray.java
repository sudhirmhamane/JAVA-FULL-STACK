class NeonArray {
    public static void main(String[] args) {

        int[] a = {9, 12, 7, 1, 10, 15};

        int count = 0;

    
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int square = n * n;
            int sum = 0;

            while (square > 0) {

                int rem = square % 10;
                sum = sum + rem;
                square = square / 10;
            }

            if (sum == n) {
                count++;
            }
        }

        int[] neon = new int[count];

        int index = 0;

        // Store Neon numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int square = n * n;
            int sum = 0;

            while (square > 0) {

                int rem = square % 10;
                sum = sum + rem;
                square = square / 10;
            }

            if (sum == n) {

                neon[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < neon.length; i++) {

            System.out.print(neon[i] + " ");
        }
    }
}