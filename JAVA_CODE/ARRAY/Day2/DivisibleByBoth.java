class DivisibleByBoth {
    public static void main(String[] args) {

        int[] a = {10, 12, 15, 16, 20, 21, 24, 25};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 3 == 0 && a[i] % 4 == 0) {

                System.out.print(a[i] + " ");
            }
        }
    }
}