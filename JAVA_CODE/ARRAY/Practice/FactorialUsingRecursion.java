public class FactorialUsingRecursion{
    public static void main(String[] args) {
        int num = 4;
        int fact = factorial(num, 1, 1);
        System.out.println(fact);
    }

    public static int factorial(int num, int fact, int i){
        if(i > num){
            return fact;
        }

        return factorial(num, fact *= i, i+1);
    }
}
