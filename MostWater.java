public class MostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int index = 0; index < height.length; index++){
            for(int index2 = index+1; index2 < height.length; index2++){
                int hei = Math.min(height[index2], height[index]);
                int area = (index2-index) * hei;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    public int maxAreaTwoPointers(int[] height) {
        int maxArea = 0;
        for(int left = 0, right = height.length -1; left< right;){
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if( height[left] > height[right])
                right--;
            else
                left++;
        }
        return maxArea;
    }
}
