import java.util.Scanner;
public class EleRepeatedOrNot {
    public static void main(String[] args){

        int a[] = {1, 2,3,4,5,6,7,8,9,9,8,7,6,5,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        int ele = sc.nextInt();
        repeatedEle(a,ele);
        sc.close();
    }

    public static void repeatedEle(int nums[], int ele){
        int max = max(nums);

        int count[] = new int[max+1];

        for(int i : nums){
            count[i]++;
        }

        if(count[ele] > 1){
            System.out.println(ele + " is repeated");
        } else{
            System.out.println(ele + " is not repeated");
        }
    }
    public static int max(int nums[]){
        int max = Integer.MIN_VALUE;

        for(int i: nums){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}
