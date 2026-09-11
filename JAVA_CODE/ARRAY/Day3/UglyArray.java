class UglyArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 5, 6, 7, 8, 10, 12, 14, 15, 18, 20};

        int count = 0;

        // Count Ugly numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;

            while (temp % 2 == 0) {
                temp = temp / 2;
            }

            while (temp % 3 == 0) {
                temp = temp / 3;
            }

            while (temp % 5 == 0) {
                temp = temp / 5;
            }

            if (temp == 1) {
                count++;
            }
        }

        // Create new array
        int[] ugly = new int[count];

        int index = 0;

        // Store Ugly numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;

            while (temp % 2 == 0) {
                temp = temp / 2;
            }

            while (temp % 3 == 0) {
                temp = temp / 3;
            }

            while (temp % 5 == 0) {
                temp = temp / 5;
            }

            if (temp == 1) {

                ugly[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < ugly.length; i++) {

            System.out.print(ugly[i] + " ");
        }
    }
}