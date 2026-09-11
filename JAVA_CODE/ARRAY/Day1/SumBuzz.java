class SumBuzz {
    public static void main(String[] args) {

        int[] a = {14, 27, 35, 42, 50, 67, 89};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 7 == 0 || a[i] % 10 == 7) {

                sum = sum + a[i];
            }
        }

        System.out.println(sum);
    }
}