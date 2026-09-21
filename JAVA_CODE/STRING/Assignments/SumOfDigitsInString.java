public class SumOfDigitsInString {
    public static void main(String[] args) {
        String s = new String("a2b3c5d7");
        sumOfDigInString(s);

    }

    public static void sumOfDigInString(String s){
        char[] ch = s.toCharArray();
        int sum = 0;
        for(int i=1; i<ch.length; i++){
            // if(!((ch[i]>='A'&&ch[i]<='Z') || (ch[i]>='a'&&ch[i]<='z'))){
            //     int num = ch[i] - 48;
            //     sum+=num;
            // }
            if(ch[i]>='0' && ch[i]<='9'){
                int num = ch[i] - 48;
                sum+= num;
            }
        }
        System.out.println("sum of Digits in String is: "+ sum);
    }
}
