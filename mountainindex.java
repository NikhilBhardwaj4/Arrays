package array;

public class mountainindex {
    public static void main(String[] args) {
        int[] arr={0,1,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            while(start<end){
                int mid = start + (end-start)/2;
                if(arr[mid]>arr[mid+1]){
                    end = mid ;
                    //we are in decreasing part of the array
                }else{
                    //we are in increasing part of the array
                    start = mid+1;
                }
            }
            //here start==end they oth pointing to the same greatest element in the array
            return start ;
    }
}
