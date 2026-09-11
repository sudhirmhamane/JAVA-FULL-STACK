import java.util.Arrays;

class AlphabetDigit {

    public static void main(String[] args) {

        char[] a = {'A', '5', 'b', '7', 'C', '2', 'd'};
        segAlphabetDigit(a);

        System.out.println("After:  " + Arrays.toString(a));
    }

    public static void segAlphabetDigit(char[] chars) {

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            while (i < j && isAlphabet(chars[i])) {
                i++;
            }

            while (i < j && !isAlphabet(chars[j])) {
                j--;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isAlphabet(char ch) {

        return (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z');
    }
}