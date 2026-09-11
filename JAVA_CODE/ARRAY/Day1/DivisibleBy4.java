class DivisibleBy4 {
    public static void main(String[] args) {

        int[] a = {10, 12, 16, 20, 25, 28, 30};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 4 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}