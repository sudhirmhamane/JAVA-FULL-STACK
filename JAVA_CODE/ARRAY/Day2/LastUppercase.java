class LastUppercase {
    public static void main(String[] args) {

        char[] ch = {'A', 'b', 'M', '7', 'P', 'e'};

        char lastUppercase = '\0';

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'A' && ch[i] <= 'Z') {

                lastUppercase = ch[i];
            }
        }

        System.out.println(lastUppercase);
    }
}