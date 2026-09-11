
/*

 9 -> sqr 9 * 9 => 81;
 8 + 1 => 9
 if(num == sum) -> neon number
*/
public class NeonNum {
    public static void main(String[] args) {
        int num = 5;
        int sqr = num * num;
        int res = neonNum(num, sqr,0);
        if(res == 1){
            System.out.println("Neon number");
        } else {
            System.out.println("not neon num");
        }
    }

    public static int neonNum(int num,int sqr, int sum){
        if(sqr == 0){
            return num == sum ? 1 : 0;
        }
        int dig = sqr % 10;

        return neonNum(num, sqr/10, sum+=dig);
    }
}
