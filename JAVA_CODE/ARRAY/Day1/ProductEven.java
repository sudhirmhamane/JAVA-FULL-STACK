class ProductEven {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int product = 1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                product = product * a[i];
            }
        }

        System.out.println(product);
    }
}