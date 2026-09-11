class SumLastThree {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = a.length - 3; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println(sum);
    }
}