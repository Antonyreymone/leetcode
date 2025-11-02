class Solution {
    public int trap(int[] height) {
        int h=height.length;
        int[] left=new int [h];
        left[0]=height[0];
        for(int i=1;i<h;i++){
            left[i]=Math.max(height[i] , left[i-1]);
        }
        int []right=new int[h];
        right[h-1]=height[h-1];
        for(int i=h-2; i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int water=0;
        for(int i=0;i<h;i++){
            water+=(Math.min(left[i],right[i]))-height[i];
        }
        return water;
    }
}