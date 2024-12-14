package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<>(10);
        Scanner in =new Scanner(System.in);
//        AL.add(223);
//        AL.add(3444567);
//        AL.add(344);
//        AL.add(123);
        for (int i = 0; i <5 ; i++) {
            AL.add(in.nextInt());
        }
        Collections.sort(AL);
        for (int i = 0; i < 5; i++) {
            System.out.print(AL.get(i) + " ");
        }

//        System.out.println(AL);

    }
}
