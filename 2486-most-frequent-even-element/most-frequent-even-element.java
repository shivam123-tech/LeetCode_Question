class Solution {
    public int mostFrequentEven(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                n.add(nums[i]);
            }
        }
        int larfreq=0;
       int ans=-1;
        for(int i=0;i<n.size();i++){
             int freq=0;
            for(int j=0;j<n.size();j++){
                if(n.get(i).equals(n.get(j))){
                    freq++;
                }
            }
            if(freq>larfreq || (freq==larfreq && n.get(i)<ans)){
                larfreq=freq;
                ans=n.get(i);
            }
        }
        return ans;
    }
}