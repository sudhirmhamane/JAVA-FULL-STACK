class SingleDigit {
    public static void main(String[] args) {

        int[] a = {5, 12, 7, 145, 99, 3, 456};

        for (int i = 0; i < a.length; i++) {

            if (a[i] >= 0 && a[i] <= 9) {
                System.out.print(a[i] + " ");
            }
        }
    }
}