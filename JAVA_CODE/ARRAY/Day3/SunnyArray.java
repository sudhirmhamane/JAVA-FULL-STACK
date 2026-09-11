class SunnyArray {
    public static void main(String[] args) {

        int[] a = {3, 8, 10, 15, 24, 48, 49, 80};

        int count = 0;

        // Count Sunny numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int next = n + 1;
            int square = 0;

            for (int j = 1; j <= next; j++) {

                if (j * j == next) {
                    square = 1;
                }
            }

            if (square == 1) {
                count++;
            }
        }

        // Create new array
        int[] sunny = new int[count];

        int index = 0;

        // Store Sunny numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int next = n + 1;
            int square = 0;

            for (int j = 1; j <= next; j++) {

                if (j * j == next) {
                    square = 1;
                }
            }

            if (square == 1) {

                sunny[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < sunny.length; i++) {

            System.out.print(sunny[i] + " ");
        }
    }
}