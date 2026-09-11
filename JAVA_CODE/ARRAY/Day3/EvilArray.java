class EvilArray {
    public static void main(String[] args) {

        int[] a = {3, 5, 7, 9, 10, 12, 15};

        int count = 0;

        // Count Evil numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int ones = 0;

            while (temp > 0) {

                int rem = temp % 2;

                if (rem == 1) {
                    ones++;
                }

                temp = temp / 2;
            }

            if (ones % 2 == 0) {
                count++;
            }
        }

        // Create new array
        int[] evil = new int[count];

        int index = 0;

        // Store Evil numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int ones = 0;

            while (temp > 0) {

                int rem = temp % 2;

                if (rem == 1) {
                    ones++;
                }

                temp = temp / 2;
            }

            if (ones % 2 == 0) {

                evil[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < evil.length; i++) {

            System.out.print(evil[i] + " ");
        }
    }
}