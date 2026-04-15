public class TestCaseOnLong {
    public static void main(String[] args) {
        /*
        when long datatype value crosses integer range
        then it is mandatory to suffix that value with
        'l' or 'L' otherwise compiler throws compile time error.
        */

        // error: integer number too large
        // long res = 2147483648;
        // System.out.println(res);

        long res = 2147483648l;
        System.out.println(res);


        /*
            Among byte, short, int, long datatype 'int' is the default datatype integer value.
        */

    }
}
