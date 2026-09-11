class FirstVowel {
    public static void main(String[] args) {

        char[] ch = {'#', 'T', 'm', 'E', '7', 'a'};

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'A' || ch[i] == 'E' ||
                ch[i] == 'I' || ch[i] == 'O' ||
                ch[i] == 'U' ||
                ch[i] == 'a' || ch[i] == 'e' ||
                ch[i] == 'i' || ch[i] == 'o' ||
                ch[i] == 'u') {

                System.out.println(ch[i]);
                break;
            }
        }
    }
}