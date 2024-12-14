package array;

public class Evenno {
    public static void main(String[] args) {
        int[] arr={12,4324,4,56,456};
        int ans = findno(arr);
        System.out.println(ans);
    }
    static int findno(int[] arr){
        int count = 0;
        for(int num:arr){
            if(even(num)){
                count++ ;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int noofdigits=digits(num);
        return noofdigits % 2 == 0;
    }

    private static int digits(int num) {
        int count = 0 ;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }
}
