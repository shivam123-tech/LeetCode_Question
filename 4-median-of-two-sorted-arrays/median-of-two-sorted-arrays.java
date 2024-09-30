class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int m[] = new int[n];
        for(int i=0;i<nums1.length;i++){
            m[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            m[nums1.length+j]=nums2[j];
        }
        Arrays.sort(m);
        if((m.length%2)!=0){
            int s=0 ;
            int e=m.length;
            int mid=(s+e)/2;
            return m[mid];
        } else{
            int s=0 ;
            int e=m.length;
            int mid=s+(e-s)/2;
            float r=m[mid]+m[mid-1];
            return r/2;

        }
    }
}