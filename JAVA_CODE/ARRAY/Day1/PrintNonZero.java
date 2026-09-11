class PrintNonZero {
    public static void main(String[] args) {

        int[] a = {0, 10, 20, 0, 30, 40, 0, 50};

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {

                System.out.print(a[i] + " ");
            }
        }
    }
}