class PrintNegative {
    public static void main(String[] args) {

        int[] a = {-10, 20, -30, 40, 50, -60};

        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {

                System.out.print(a[i] + " ");
            }
        }
    }
}