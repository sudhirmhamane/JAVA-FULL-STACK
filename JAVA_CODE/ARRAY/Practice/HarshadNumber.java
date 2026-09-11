
import java.util.Arrays;

class HarshadNumber {

    public static void main(String[] args) {

        int a[] = {18, 20, 21, 22, 24, 25, 27, 30, 31, 42};

        int result[] = harshadNumber(a);

        System.out.println(Arrays.toString(result));
    }

    public static int[] harshadNumber(int[] a) {

        int count = 0;

        // Count Harshad numbers
        for (int i = 0; i < a.length; i++) {

            int num = a[i];
            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }

            if (num % sum == 0) {
                count++;
            }
        }

        // Create array according to count
        int result[] = new int[count];
        int index = 0;

        // Store Harshad numbers
        for (int i = 0; i < a.length; i++) {

            int num = a[i];
            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }

            if (num % sum == 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
}