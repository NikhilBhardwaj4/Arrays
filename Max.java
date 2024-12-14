package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        int size ;
        System.out.println("Enter the size of list-> ");
        size=in.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);
       for(int num : list){
           System.out.print(num+" ");
       }
        System.out.println();
        System.out.print("the max number is; ");
        System.out.println(list.get(size-1));
    }
}
