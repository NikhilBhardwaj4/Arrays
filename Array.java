package array;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.print("enter your array: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int j : arr) {
//            System.out.print(j);
//        }
//    }


    // Import the Arrays class from the java.util package.

        // The main method where the program execution starts.
        public static void main(String[] args) {
            int[] my_array = {4,5,6,7,8};
            int[] arr = new int[my_array.length-1];
            int k=1;

            for(int i=0,p=0;i<my_array.length;i++){
                if(k==i){
                    continue;
                }
                arr[p++]=my_array[i];
            }

            // Print the modified array after removing the second element.
            System.out.println("After removing the second element: " + Arrays.toString(arr));
        }
    }

