class BinaryArray {
    public static void main(String[] args) {

        int[] a = {5, 10, 7, 12};

        for (int i = 0; i < a.length; i++) {

            int n = a[i];

            int binary = 0;
            int place = 1;

            while (n > 0) {

                int rem = n % 2;

                binary = binary + (rem * place);

                place = place * 10;

                n = n / 2;
            }

            System.out.println(a[i] + " = " + binary);
        }
    }
}