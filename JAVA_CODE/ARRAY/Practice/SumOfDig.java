import java.util.Scanner;
class SumOfDig{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int sum = sumOfDig(num, 0);
        System.out.println("sum is: "+ sum);

        sc.close();
    }

    public static int sumOfDig(int num, int sum){

        if(num == 0){
            return sum;
        }
        int dig = num % 10;
        return sumOfDig(num /=10, sum+=dig);
    }
}