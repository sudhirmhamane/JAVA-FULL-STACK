class ProductBuzz {
    public static void main(String[] args) {

        int[] a = {14, 27, 35, 42, 50, 67, 89};

        int product = 1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 7 == 0 || a[i] % 10 == 7) {

                product = product * a[i];
            }
        }

        System.out.println(product);
    }
}