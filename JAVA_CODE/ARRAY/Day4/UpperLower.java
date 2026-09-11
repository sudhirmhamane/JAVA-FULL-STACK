import java.util.Arrays;

class UpperLower {

    public static void main(String[] args) {

        char[] a = {'A', 'b', 'C', 'd', 'E', 'f', 'G'};
        segUpperLower(a);
        System.out.println(Arrays.toString(a));
    }

    public static void segUpperLower(char[] chars) {

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            while (i < j && isUpper(chars[i])) {
                i++;
            }

            while (i < j && !isUpper(chars[j])) {
                j--;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isUpper(char ch) {

        return ch >= 'A' && ch <= 'Z';
    }
}