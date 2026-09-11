class MiddleTwoChar {
    public static void main(String[] args) {

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F'};

        if (ch.length % 2 == 0) {

            int index1 = ch.length / 2 - 1;
            int index2 = ch.length / 2;

            System.out.print(ch[index1] + " ");
            System.out.print(ch[index2]);
        }
        else {
            System.out.println("Array length is not even");
        }
    }
}