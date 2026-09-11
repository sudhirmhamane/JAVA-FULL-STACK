class ReverseCharArray {
    public static void main(String[] args) {

        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};

        for (int i = ch.length - 1; i >= 0; i--) {

            System.out.print(ch[i] + " ");
        }
    }
}