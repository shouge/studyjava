/**
    选择排序
 */

public class SelecSorted {

    public static void main(String[] args) {
        
        int[] nums = {1,5,6,9,8,7,3,4,2};

        int minIndex = 0;
        
        for(int i=0;i<nums.length-1;i++) {
            // 每次设置一个最小元素
            minIndex = i;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[minIndex]>nums[j]) {
                    minIndex = j;
                }
            }

            // 判断需要交换的下标是否为自己
            if(minIndex!=i) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }

        for(int key: nums) {
            System.out.println(key);
        }

    }
}