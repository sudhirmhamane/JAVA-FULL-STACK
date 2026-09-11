class SpyArray {
    public static void main(String[] args) {

        int[] a = {1124, 123, 22, 1234, 1412};

        int count = 0;
        
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;

            int sum = 0;
            int product = 1;

            while (temp > 0) {

                int rem = temp % 10;

                sum = sum + rem;
                product = product * rem;

                temp = temp / 10;
            }

            if (sum == product) {
                count++;
            }
        }
        int[] spy = new int[count];

        int index = 0;
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int temp = n;

            int sum = 0;
            int product = 1;

            while (temp > 0) {

                int rem = temp % 10;

                sum = sum + rem;
                product = product * rem;

                temp = temp / 10;
            }

            if (sum == product) {

                spy[index] = n;
                index++;
            }
        }

        for (int i = 0; i < spy.length; i++) {

            System.out.print(spy[i] + " ");
        }
    }
}