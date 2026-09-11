class AvgEven {
    public static void main(String[] args) {

        int[] a = {12, 15, 18, 21, 24, 27};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                sum = sum + a[i];
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println(average);
    }
}