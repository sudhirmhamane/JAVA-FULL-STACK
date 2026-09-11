class LastLowercase {
    public static void main(String[] args) {

        char[] ch = {'A', 'b', 'M', 'n', 'P', 'z'};

        char lastLowercase = '\0';

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'a' && ch[i] <= 'z') {

                lastLowercase = ch[i];
            }
        }

        System.out.println(lastLowercase);
    }
}