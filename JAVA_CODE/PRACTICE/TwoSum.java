import java.util.*;

public class TwoSum {

    public static int[] Sum(int[] arr, int target) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 9};
        int target = 5;

        int[] ans = Sum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}