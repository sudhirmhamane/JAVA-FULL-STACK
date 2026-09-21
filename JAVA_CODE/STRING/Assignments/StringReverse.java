public class StringReverse {
    public static void main(String[] args) {
        String s = new String("Madam");
        System.out.println(reverse(s));
    }

    public static String reverse(String s){
        char[] ch = s.toCharArray();
        int i=0;
        int j = ch.length-1;
        while (i<=j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return new String(ch);

    }
}
