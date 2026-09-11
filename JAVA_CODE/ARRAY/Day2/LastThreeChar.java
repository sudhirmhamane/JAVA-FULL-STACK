class LastThreeChar {
    public static void main(String[] args) {

        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u'};

        for (int i = ch.length - 3; i < ch.length; i++) {

            System.out.print(ch[i] + " ");
        }
    }
}