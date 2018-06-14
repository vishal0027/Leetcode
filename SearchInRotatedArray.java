class Solution {
 public int search(int[] nums, int target) {
            if(nums==null || nums.length==0) return -1;
            int left=0,right=nums.length-1;
            while (left<=right) {
                if(left == right){
                    return target==nums[left]?left:-1;
                }
                int mid=(left + right)/2;
                if((nums[mid]<nums[right] && (nums[mid]<target && target<=nums[right])) ||((nums[mid]<target || target<=nums[right]) && nums[mid]>nums[right])) {
                    left=mid+1;
                } else {
                    right=mid;
                }
            }
            return -1;
        }
}