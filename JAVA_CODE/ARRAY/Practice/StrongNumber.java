
/*
145 -> count -> 3

factorial of sum of eacch dig == original num then strong num or not

1 + 24 + 120 => 145 == 145
1! => 1 
4! => 24
5! => 1 * 2 * 3 * 4 * 5=> 
*/
public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int count = 0;
        int temp = num;
        while(num != 0){
            count++;
            num/=10;
        }
        num = temp;
        int res = strongNum(num, count,0, 1, temp); 
        if(res == 1){
            System.out.println("Strong number");
        } else {
            System.out.println("not strong number");
        }
    }

    public static int strongNum(int num, int count, int sum, int i, int temp){
        if(i > count){
            return temp == sum ? 1 : 0;
        }
        int dig = num % 10;
        int fact = factorial(dig, 1);

        return strongNum(num/10, count, sum+=fact, i+1 , temp);

    }
    public static int factorial(int num, int fact){
        if(num == 0 || num == 1){
            return fact;
        }
        return  factorial(num-1, fact*num);
    }
}
