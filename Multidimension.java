package array;
import java.util.Scanner;
import java.util.Arrays;

public class Multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
