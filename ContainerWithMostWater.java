class Solution {
   public int maxArea(int[] height) {
        int low = 0;int high = height.length-1;
        int maxarea = 0; int area = 0;
        while (low < high) {
            if (height[low] > height[high]) {
                area = height[high] * (high-low);
                high--;
            } else {
                area = height[low] * (high-low);
                low++;
            }
            if (maxarea < area) maxarea = area;
        }
        return maxarea; 
    }
}