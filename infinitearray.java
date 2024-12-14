package array;

public class infinitearray {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6,8,10,11,23,34,45,56};
        int target = 5;
        System.out.println(ans(nums,target));
    }
    static int ans(int[] nums,int target){
        int start = 0;
        int end = 1;
        while(target>nums[end]){
            int temp = end+1;
            end = end+(end - start +1)*2;
            start =temp;
        }
        return binarysearch(nums,target,start,end);
    }
    static int binarysearch(int[] nums ,int target, int start, int end ){
        while( start <= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end=mid-1;
            } else if(target > nums[mid]){
                start =mid+1;
            }else return mid;
        }
        return -1;
    }
}
