class TwoDigit {
    public static void main(String[] args) {

        int[] a = {5, 12, 7, 145, 99, 3, 456};

        for (int i = 0; i < a.length; i++) {

            if (a[i] >= 10 && a[i] <= 99) {
                System.out.print(a[i] + " ");
            }
        }
    }
}