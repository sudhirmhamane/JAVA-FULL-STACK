class LastDigit {
    public static void main(String[] args) {

        char[] ch = {'A', '4', '#', '8', 'm', '2'};

        char lastDigit = '\0';

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= '0' && ch[i] <= '9') {

                lastDigit = ch[i];
            }
        }

        System.out.println(lastDigit);
    }
}