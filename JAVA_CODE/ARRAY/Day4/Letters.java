import java.util.Arrays;

class Letters {

    public static void main(String[] args) {

        char[] a = {'A', '5', 'b', '@', 'C', ' ', '7', 'd'};
        segregate(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segregate(char[] a) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && isLetter(a[i])) {
                i++;
            }

            while (i < j && !isLetter(a[j])) {
                j--;
            }

            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isLetter(char ch) {

        return (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z');
    }
}