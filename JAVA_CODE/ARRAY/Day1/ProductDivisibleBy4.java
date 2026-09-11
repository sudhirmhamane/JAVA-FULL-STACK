class ProductDivisibleBy4 {
    public static void main(String[] args) {

        int[] a = {10, 12, 16, 20, 25, 28, 30};

        int product = 1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 4 == 0) {
                product = product * a[i];
            }
        }

        System.out.println(product);
    }
}