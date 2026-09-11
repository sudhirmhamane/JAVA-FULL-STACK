class PrintOdd {
    public static void main(String[] args) {

        int[] a = {10, 15, 20, 25, 30, 35};

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {

                System.out.print(a[i] + " ");
            }
        }
    }
}