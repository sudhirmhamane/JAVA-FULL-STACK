public class SpyNumber {
    public static void main(String[] args) {
        int num = 45;
        int isSpy = spyNum(num, 0, 1);
        if(isSpy == 1){
            System.out.println("Spy number");
        } else {
            System.out.println("not spy number");
        }
        
    }
    public static int spyNum(int num, int sum, int prod){
        if(num == 0){
            return sum == prod ? 1 : 0;
        }
        int dig = num % 10;
        return spyNum(num/10, sum+=dig, prod*=dig);
    }
}
