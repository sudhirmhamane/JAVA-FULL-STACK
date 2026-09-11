class SumAscii {
    public static void main(String[] args) {

        char[] ch = {'J', 'a', 'v', 'a'};

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {

            sum = sum + ch[i];
        }

        System.out.println(sum);
    }
}