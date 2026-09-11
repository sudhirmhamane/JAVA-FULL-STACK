import java.util.Arrays;

class UpperLowerVowels {

    public static void main(String[] args) {

        char[] a = {'a', 'A', 'e', 'B', 'I', 'o', 'E', 'u'};
        segregate(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segregate(char[] a) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && isUpperVowel(a[i])) {
                i++;
            }

            while (i < j && !isUpperVowel(a[j])) {
                j--;
            }

            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isUpperVowel(char ch) {
        return ch == 'A' || ch == 'E' ||
               ch == 'I' || ch == 'O' ||
               ch == 'U';
    }
}