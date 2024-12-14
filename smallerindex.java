package array;

public class smallerindex {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,4,3,2,1};
        int target = 3;
        int peak = peakmountainindex(arr);
        int firsttry = binarysearch(arr,target,0,peak);
        int secondtry =binarysearch(arr,target,peak,arr.length-1);
        if(firsttry!=-1){
            System.out.println(firsttry);
        }else{
            System.out.println(secondtry);
        }
    }
    static int peakmountainindex(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }else{
                start =mid+1;
            }
        }
        return start;
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end =mid-1;
            }
            else if(arr[mid]<target){
                start =mid+1;
            } else return mid;
        }
        return -1;
    }
}
