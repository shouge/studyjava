/**
    二分查找法
 */

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(nums, 6));
    }

    public static int binarySearch(int[] nums, int key) {
        if(nums.length == 0) {
            return 0;
        }
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start<=end) {
            int middle = (start+end)/2;
            if(nums[middle]>key) {
                end = middle - 1;
            }else if(nums[middle]<key) {
                start = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }

}