import java.util.Arrays;

class UpperLowerConsonants {

    public static void main(String[] args) {

        char[] a = {'b', 'A', 'C', 'd', 'E', 'F', 'g', 'H'};
        segregate(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segregate(char[] a) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            while (i < j && isUpperConsonant(a[i])) {
                i++;
            }

            while (i < j && !isUpperConsonant(a[j])) {
                j--;
            }

            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isUpperConsonant(char ch) {

        return ch >= 'A' && ch <= 'Z' &&
               !isVowel(ch);
    }

    public static boolean isVowel(char ch) {

        return ch == 'A' || ch == 'E' ||
               ch == 'I' || ch == 'O' ||
               ch == 'U';
    }
}