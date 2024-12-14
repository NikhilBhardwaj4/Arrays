package array;

import java.util.Arrays;

public class firstandlastoccurence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,7,7,7,8,8,9};
        int target = 7;
        int[] ans = occurence(nums,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] occurence(int[] nums , int target){
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] nums, int target, boolean findsearchindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = end - (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                 ans =mid;
                 if(findsearchindex){
                     end =mid-1;
                 }
                 else{
                     start =mid+1;
                 }
            }
        }
        return ans;
    }
}