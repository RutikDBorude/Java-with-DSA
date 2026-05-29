class Solution {
    public int maxArea(int[] height) {
        int left= 0;
        int right = height.length-1;
        int maxarea = 0;
        while(left < right){
            int area = 0;
            if(height[left] < height[right]){
                area = height[left] * (right - left);
                left++;
            }else{
                area = height[right] * (right - left);
                right--;
            }
            maxarea = Math.max(area,maxarea);
        }
        return maxarea;
    }
}