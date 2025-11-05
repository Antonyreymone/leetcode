class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        while (l<r){
            int wid=r-l;
            int h=Math.min(height[l],height[r]);
            int water=wid*h;
            ans=Math.max(ans,water);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
    return ans;   
    }
}