import java.util.Arrays;

class AlphabetSpecial {

    public static void main(String[] args) {

        char[] a = {'A', '@', 'b', '#', 'C', '$', 'd'};
        segAlphabetSpecial(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segAlphabetSpecial(char[] chars) {

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