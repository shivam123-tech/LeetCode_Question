class Solution {
    public int maxArea(int[] height) {
        int lp=0,rp=height.length-1;
        int mostwater=0;
        while(lp<rp){
          int ht=Math.min(height[lp],height[rp]);
          int width=rp-lp;
          int cw=ht*width;
          mostwater=Math.max(cw,mostwater);
          if(height[lp]<height[rp]){
            lp++;
          } else{
            rp--;
          }
        }
        return mostwater;
    }
}