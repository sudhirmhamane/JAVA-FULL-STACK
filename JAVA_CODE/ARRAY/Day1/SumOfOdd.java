class SumOfOdd {
    public static void main(String[] args) {

        int[] a = {11, 20, 33, 40, 55};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {
                sum = sum + a[i];
            }
        }

        System.out.println(sum);
    }
}