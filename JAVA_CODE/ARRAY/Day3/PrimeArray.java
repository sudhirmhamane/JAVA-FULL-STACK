class PrimeArray {
    public static void main(String[] args) {

        int[] a = {10, 2, 7, 9, 11, 15, 17, 20};

        int count = 0;

        
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int factors = 0;

            for (int j = 1; j <= n; j++) {

                if (n % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                count++;
            }
        }

        
        int[] prime = new int[count];

        int index = 0;


        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int factors = 0;

            for (int j = 1; j <= n; j++) {

                if (n % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {

                prime[index] = n;
                index++;
            }
        }
        for (int i = 0; i < prime.length; i++) {

            System.out.print(prime[i] + " ");
        }
    }
}