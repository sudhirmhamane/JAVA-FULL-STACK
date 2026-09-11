class MiddleElement {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        if (a.length % 2 != 0) {

            int middleIndex = a.length / 2;

            System.out.println(a[middleIndex]);
        }
        else {
            System.out.println("No Middle Element");
        }
    }
}