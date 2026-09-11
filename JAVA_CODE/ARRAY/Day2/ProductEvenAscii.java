class ProductEvenAscii {
    public static void main(String[] args) {

        char[] ch = {'A', 'B', 'C', 'D'};

        int product = 1;

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] % 2 == 0) {
                product = product * ch[i];
            }
        }

        System.out.println(product);
    }
}