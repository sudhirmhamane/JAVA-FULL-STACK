import java.util.Arrays;

class PrimeIndex {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        segregate(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segregate(int[] a) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && isPrimeIndex(i)) {
                i++;
            }

            while (i < j && !isPrimeIndex(j)) {
                j--;
            }

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isPrimeIndex(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}