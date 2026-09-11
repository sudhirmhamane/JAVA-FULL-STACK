class TechArray {
    public static void main(String[] args) {

        int[] a = {2025, 3025, 9801, 1234, 25, 81};

        int count = 0;

        // Count Tech numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];

            int temp = n;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            if (digits % 2 == 0) {

                int divisor = 1;

                for (int j = 1; j <= digits / 2; j++) {
                    divisor = divisor * 10;
                }

                int first = n / divisor;
                int second = n % divisor;

                int sum = first + second;
                int square = sum * sum;

                if (square == n) {
                    count++;
                }
            }
        }

        // Create new array
        int[] tech = new int[count];

        int index = 0;

        // Store Tech numbers
        for (int i = 0; i < a.length; i++) {

            int n = a[i];

            int temp = n;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            if (digits % 2 == 0) {

                int divisor = 1;

                for (int j = 1; j <= digits / 2; j++) {
                    divisor = divisor * 10;
                }

                int first = n / divisor;
                int second = n % divisor;

                int sum = first + second;
                int square = sum * sum;

                if (square == n) {

                    tech[index] = n;
                    index++;
                }
            }
        }

        // Print new array
        for (int i = 0; i < tech.length; i++) {

            System.out.print(tech[i] + " ");
        }
    }
}