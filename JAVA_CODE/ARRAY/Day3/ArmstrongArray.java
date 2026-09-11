class ArmstrongArray {
    public static void main(String[] args) {

        int[] a = {153, 123, 370, 407, 1634, 200};

        int count = 0;

        // Count Armstrong numbers
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

            while (temp > 0) {

                int rem = temp % 10;

                int power = 1;

                for (int j = 1; j <= digits; j++) {
                    power = power * rem;
                }

                sum = sum + power;

                temp = temp / 10;
            }

            if (sum == n) {
                count++;
            }
        }

        // Create new array
        int[] armstrong = new int[count];

        int index = 0;

        // Store Armstrong numbers
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

            while (temp > 0) {

                int rem = temp % 10;

                int power = 1;

                for (int j = 1; j <= digits; j++) {
                    power = power * rem;
                }

                sum = sum + power;

                temp = temp / 10;
            }

            if (sum == n) {

                armstrong[index] = n;
                index++;
            }
        }

        // Print new array
        for (int i = 0; i < armstrong.length; i++) {

            System.out.print(armstrong[i] + " ");
        }
    }
}