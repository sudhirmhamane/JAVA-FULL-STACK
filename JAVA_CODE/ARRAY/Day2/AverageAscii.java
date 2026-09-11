class AverageAscii {
    public static void main(String[] args) {

        char[] ch = {'M', 'N', 'O'};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < ch.length; i++) {

            sum = sum + ch[i];
            count++;
        }

        double average = (double) sum / count;

        System.out.println(average);
    }
}