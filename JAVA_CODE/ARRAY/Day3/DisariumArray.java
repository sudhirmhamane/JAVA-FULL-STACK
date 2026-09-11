class DisariumArray {
    public static void main(String[] args) {

        int[] a = {135, 89, 123, 175, 518, 1306};

        int count = 0;

        // Count Disarium numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = n;

            int sum = 0;
            int position = digits;

            while (temp > 0) {

                int rem = temp % 10;

                int power = 1;

                for (int j = 1; j <= position; j++) {
                    power = power * rem;
                }

                sum = sum + power;

                position--;
                temp = temp / 10;
            }

            if (sum == n) {
                count++;
            }
        }

        // Create new array
        int[] disarium = new int[count];

        int index = 0;

        // Store Disarium numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            temp = n;

            int sum = 0;
            int position = digits;

            while (temp > 0) {

                int rem = temp % 10;

                int power = 1;

                for (int j = 1; j <= position; j++) {
                    power = power * rem;
                }

                sum = sum + power;

                position--;
                temp = temp / 10;
            }

            if (sum == n) {

                disarium[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < disarium.length; i++) {

            System.out.print(disarium[i] + " ");
        }
    }
}