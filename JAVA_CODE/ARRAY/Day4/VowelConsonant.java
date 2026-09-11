import java.util.Arrays;

class VowelConsonant {

    public static void main(String[] args) {

        char[] a = {'b', 'a', 'c', 'e', 'd', 'i', 'f'};

        segVowelConsonant(a);

        System.out.println(Arrays.toString(a));
    }

    public static void segVowelConsonant(char[] chars) {

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            while (i < j && isVowel(chars[i])) {
                i++;
            }

            while (i < j && !isVowel(chars[j])) {
                j--;
            }

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u';
    }
}