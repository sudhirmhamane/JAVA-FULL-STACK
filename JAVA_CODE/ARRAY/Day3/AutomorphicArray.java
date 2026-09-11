class AutomorphicArray {
    public static void main(String[] args) {

        int[] a = {5, 6, 10, 25, 26, 30, 76, 100};

        int count = 0;

        // Count Automorphic numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int square = n * n;

            int temp = n;
            int divisor = 1;

            while (temp > 0) {

                divisor = divisor * 10;
                temp = temp / 10;
            }

            if (square % divisor == n) {
                count++;
            }
        }

        // Create new array
        int[] automorphic = new int[count];

        int index = 0;

        // Store Automorphic numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int square = n * n;

            int temp = n;
            int divisor = 1;

            while (temp > 0) {

                divisor = divisor * 10;
                temp = temp / 10;
            }

            if (square % divisor == n) {

                automorphic[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < automorphic.length; i++) {

            System.out.print(automorphic[i] + " ");
        }
    }
}