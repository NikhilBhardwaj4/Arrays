package array;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {45, 2, 2, 4, 7, -3, -6, 78, 90};
        System.out.println("enter the target value: ");
        int target = in.nextInt();
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

