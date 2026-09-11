class HarshadArray {
    public static void main(String[] args) {

        int[] a = {18, 20, 21, 22, 24, 25, 30};

        int count = 0;

        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int sum = 0;

            while (temp > 0) {

                int rem = temp % 10;

                sum = sum + rem;

                temp = temp / 10;
            }

            if (n % sum == 0) {
                count++;
            }
        }

        int[] harshad = new int[count];

        int index = 0;

        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;
            int sum = 0;

            while (temp > 0) {

                int rem = temp % 10;

                sum = sum + rem;

                temp = temp / 10;
            }

            if (n % sum == 0) {

                harshad[index] = n;
                index++;
            }
        }

        for (int i = 0; i < harshad.length; i++) {

            System.out.print(harshad[i] + " ");
        }
    }
}