class LastSpecial {
    public static void main(String[] args) {

        char[] ch = {'@', 'A', '#', '7', '$', 'm'};

        char lastSpecial = '\0';

        for (int i = 0; i < ch.length; i++) {

            if (!((ch[i] >= 'A' && ch[i] <= 'Z') ||
                  (ch[i] >= 'a' && ch[i] <= 'z') ||
                  (ch[i] >= '0' && ch[i] <= '9'))) {

                lastSpecial = ch[i];
            }
        }

        System.out.println(lastSpecial);
    }
}