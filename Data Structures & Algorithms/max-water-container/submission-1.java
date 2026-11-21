class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int max = 0;

        while(start < end){
            int width = Math.abs(start - end);

            int height = Math.min(heights[start] , heights[end]);

            int water = width * height;

            if(water > max){
                max = water;
            }

            if(heights[start] < heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max;
    }
}