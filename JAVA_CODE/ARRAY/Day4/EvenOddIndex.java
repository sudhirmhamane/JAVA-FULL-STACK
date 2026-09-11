import java.util.Arrays;

class EvenOddIndex {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50, 60, 70};
        segregate(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segregate(int[] a) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && isEvenIndex(i)) {
                i++;
            }

            while (i < j && isOddIndex(j)) {
                j--;
            }

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isEvenIndex(int index) {
        return index % 2 == 0;
    }

    public static boolean isOddIndex(int index) {
        return index % 2 != 0;
    }
}