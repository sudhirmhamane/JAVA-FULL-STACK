public class Palindrome {
    public static void main(String[] args) {
        int arr[] = {121, 221, 4433, 33233};
        palindrome(arr);
    }

    public static void palindrome(int[] a){

        for(int i=0; i<a.length; i++){
            int num = a[i];
            int rev = 0;
            int temp = num;

            while (temp != 0) {
                int ld = temp % 10;
                rev = rev*10+ld;
                temp /= 10;
            }

            if(num == rev){
                System.out.print(num+ " ");
            }

        }
    }
}
