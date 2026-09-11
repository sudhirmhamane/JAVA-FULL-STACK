public class PerfectSquare {
    public static void main(String[] args) {
        int num = 144;
        int sqrRoot = (int) Math.sqrt(num);
        int root = sqrRoot * sqrRoot;
        int res = perfectSqruare(num, root);
        if(res == 1){
            System.out.println("perfect square");
        } else {
            System.out.println("not perfect square");
        }
    }

    public static int perfectSqruare(int num , int root){
        if(num < 0){
            return 0; 
        }
        if(root == num || root != num){
            return num == root ? 1 : 0;
        }
        return perfectSqruare(num, root);
    }
}
