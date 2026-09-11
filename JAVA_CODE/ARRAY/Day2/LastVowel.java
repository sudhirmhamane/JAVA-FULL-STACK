class LastVowel {
    public static void main(String[] args) {

        char[] ch = {'A', 'k', 'e', 'M', 'o', '#'};

        char lastVowel = '\0';

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'A' || ch[i] == 'E' ||
                ch[i] == 'I' || ch[i] == 'O' ||
                ch[i] == 'U' ||
                ch[i] == 'a' || ch[i] == 'e' ||
                ch[i] == 'i' || ch[i] == 'o' ||
                ch[i] == 'u') {

                lastVowel = ch[i];
            }
        }

        System.out.println(lastVowel);
    }
}