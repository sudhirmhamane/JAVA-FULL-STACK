class PerfectSquareArray {
    public static void main(String[] args) {

        int[] a = {4, 7, 9, 10, 16, 20, 25, 30};

        int count = 0;

        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int square = 0;

            for (int j = 1; j <= n; j++) {

                if (j * j == n) {
                    square = 1;
                }
            }

            if (square == 1) {
                count++;
            }
        }

        
        int[] perfectSquare = new int[count];

        int index = 0;

        
        for (int i = 0; i < a.length; i++) {

            int n = a[i];
            int square = 0;

            for (int j = 1; j <= n; j++) {

                if (j * j == n) {
                    square = 1;
                }
            }

            if (square == 1) {

                perfectSquare[index] = n;
                index++;
            }
        }

        for (int i = 0; i < perfectSquare.length; i++) {

            System.out.print(perfectSquare[i] + " ");
        }
    }
}