package array;

public class Ceilingno {
        public static void main(String[] args) {
            int[] arr ={ -5,-1,0,23,45,99,189};
            int target = -2;
            int ans = binarysearch(arr,target);
            System.out.println(ans);
        }
        static int binarysearch(int[] nums , int n){
            int start = 0;
            int end = nums.length-1;
            while( start <= end){
                int mid = start + (end-start)/2;
                if(n < nums[mid]){
                    end=mid-1;
                } else if(n > nums[mid]){
                    start =mid+1;
                }else return nums[mid];
            }
            return nums [end];//floor of the number
//            return nums[start]; ceiling of the number
        }

}
